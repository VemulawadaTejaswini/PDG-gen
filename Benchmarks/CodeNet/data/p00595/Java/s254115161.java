import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            while((line = br.readLine()) != null) {
                String[] list = line.split(" ", 0);
                int x = Integer.parseInt(list[0]);
                int y = Integer.parseInt(list[1]);
                getGcb(x, y);
            }

       } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getGcb(int x, int y) {
    	if(x < y) {
            x = x + y;
            y = x - y;
            x = x - y;
       }
    	while(y > 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        System.out.println(x);
    }
}
import java.io.*;

public class Main {
    /**
     *
     */

    private static final int _100000 = 100000;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[]  x;
        int i;
        x = new int[100000];
        int count = 0;
        try {
            for(i=1;i<100000;i++) {
            String line = reader.readLine();
            x[i] = Integer.parseInt(line);
            if (x[i] == 0) break;
            count++;
            }

            for(i=1;i<=count;i++){
                System.out.println("Case " + i + ": " + x[i]);
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e){
            System.out.println("falese");
        }
    }
}

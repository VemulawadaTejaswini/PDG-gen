import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String blank = " ";
        String data[] = br.readLine().split(blank);
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int c = Integer.parseInt(data[2]);
        
        int i = 0;
        for (int l = 0; a + l <= b; l++){
            if(c % (a + l) == 0){
                i++;
            }
        }
        System.out.println(i);
    }
}

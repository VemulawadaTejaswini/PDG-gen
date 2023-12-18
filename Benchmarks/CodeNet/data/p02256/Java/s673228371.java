import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        do{
            if(x >= y){
                int tmp = x;
                x = y;
                y = tmp % y;
            }
        }while(x % y != 0);

        System.out.println(y);
    }
}
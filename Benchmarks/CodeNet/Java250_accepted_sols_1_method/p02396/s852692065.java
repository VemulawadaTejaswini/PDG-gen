import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while(true){
            i++;
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            System.out.println("Case "+ i +": "+ n);
        }
    }
}
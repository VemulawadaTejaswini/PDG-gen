import java.io.*;
 
public class Main
{
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         int a = 1;
        for (int i = 1; ; i++){
            int a = Integer.parseInt(read.readLine());
            if (a == 0){
                break;
            }
            System.out.println("Case " + i + ": " + x);
        }
    }
}
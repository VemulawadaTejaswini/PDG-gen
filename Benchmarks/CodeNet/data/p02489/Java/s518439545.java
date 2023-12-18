import java.io.*;
 public class Main
{
    public static void main(String[] args) {
        int a=1;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; ; i++){
            int a = Integer.parseInt(read.readLine());
            if (a == 0){
                break;
            }
            System.out.println("Case " + i + ": " + x);
        }
    }
}
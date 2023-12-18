import java.io.*;
public class Main {
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(br.readLine());
        if(a>=30){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

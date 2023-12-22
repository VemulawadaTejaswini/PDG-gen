import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
         BufferedReader br 
           = new BufferedReader(new InputStreamReader(System.in));
           
        String str = br.readLine();
        
        String[] strArry = str.split(" ");
        int num = 0;
        int a = Integer.parseInt(strArry[0]);
        int b = Integer.parseInt(strArry[1]);
        int c = Integer.parseInt(strArry[2]);
        
        for(int i = a;i<=b;i++){
             if(c%i==0)
               num++;
        }
        System.out.println(num);
    }
}
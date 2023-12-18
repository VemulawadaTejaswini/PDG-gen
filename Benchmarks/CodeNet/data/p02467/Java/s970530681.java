import java.io.*;
       
public class Main{
   public static void main(String[] args)throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String str = br.readLine();
   long n = Long.parseLong(str);
    System.out.print(n + ":");
    while(n%2 ==0){
         int s = 2;
        System.out.print(" " + s);
        n /=2;
            }
    for(int i=3; i*i<=n; i+=2){
        while(n%i ==0){
        System.out.print(" " + i);
        n /= i;
            }
        }
    if (n > 1) {
        System.out.print(" " + n);
    }
    }
}
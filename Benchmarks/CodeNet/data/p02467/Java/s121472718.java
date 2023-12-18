import java.io.*;
   
public class Main{
   public static void main(String[] args){
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Intenger.parseint(br.readLine());   
System.out.print(n + ":");
while(n%2 ==0){
System.out.print(" " + 2);
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
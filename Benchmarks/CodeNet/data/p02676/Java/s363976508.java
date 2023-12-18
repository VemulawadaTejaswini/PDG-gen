import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        String N=input.next();
        int n=N.length();
      if(n<=k){
      System.out.print(N);
      }else{
        System.out.print(N.substring(0,k)+"...");
      }
    }   
}
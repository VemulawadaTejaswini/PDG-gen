import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   boolean []nu=new boolean[30];
   for(int i=0;i<28;i++){
   int n=sc.nextInt()-1;
   nu[n]=true;
   }
   for(int i=0;i<30;i++){
	   if(nu[i]==false)System.out.println(i+1);
	   }
 }
}
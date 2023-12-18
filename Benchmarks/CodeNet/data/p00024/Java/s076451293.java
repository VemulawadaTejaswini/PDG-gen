import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   while(sc.hasNext()){
	   double n=sc.nextDouble();
	   int i=1;
	   for(;;){
		   if(Math.sqrt((5*i-5)/4.9)*9.8>n)break;
	       i++;
	   }
	   System.out.println(i);
   }
   }
   }
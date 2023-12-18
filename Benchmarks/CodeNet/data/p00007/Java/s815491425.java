import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
   int money =100000;
   for(int i=0; i<n; i++){
	   money*=1.05;
   if(money%1000!=0){money+=1000-money%1000;
   }
   }
   System.out.println(money);
   }
   }
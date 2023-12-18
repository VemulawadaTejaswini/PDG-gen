import java.util.*;
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
	   sc = new Scanner(System.in);
	   int m=0;
	   while(true){
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   if(a==0&&b==0)break;
	   for(int i = 0;i<a;i++){
		      while( m<b){
			        System.out.print("#"); 
			        m+=1;
		   }
		    System.out.println();
	    }
	   System.out.println();
	   }
	   
	}
}
import java.util.Scanner;
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
	   sc = new Scanner(System.in);
	 
	   while(true){
	   int h=sc.nextInt();
	   int w=sc.nextInt();
	   if(h==0&&w==0)break;
	   else for(int i = 0;i<h;i++){
		   int m=0;   
		   while(m<w){
			   System.out.print("#");
			   m=m+1;
		   }
		   
	         System.out.println();
   }
	   System.out.println();
  }  
 }
}
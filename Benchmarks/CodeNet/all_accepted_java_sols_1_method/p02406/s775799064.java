import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int i= 1;
	 while (++i <= n){
		 if(i % 3 == 0){
			 System.out.printf(" "+ i);
		 }else if(i % 10 == 3){
			 System.out.printf(" "+ i); 
		 }else{
			 int x = i / 10;
			 while(x != 0){
				 if(x % 10 == 3){
					 System.out.printf(" "+ i);
					 break;
				 }else{
					 x /= 10;
			 }
			 }
		 }
	 }
	 System.out.printf("\n"); 
	}
}
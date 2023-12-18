import java.util.Scanner;
	
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[20000];
		int[] b = new int[20000];
		char[] op = new char[20000];
		
		 for(int i = 0; i <20000; i++) {
			
			 a[i] = sc.nextInt();
			 op[i] = sc.next().charAt(0);
			 if(op[i] == '?') break;
			 b[i] = sc.nextInt();
			
			
		 }
		 
		 for(int i = 0; i <20000; i++) {
			 if(op[i] == '?') break; 
			 
			 else if(op[i] != '?'){ 
				 switch(op[i]) {
				 case '+' : System.out.println( a[i]+b[i]);
				 break;
				 case '-' : System.out.println( a[i]-b[i]);
				 break;
				 case '*' : System.out.println( a[i]*b[i]);
				 break;
				 case '/' : System.out.println( a[i]/b[i]);
				 break;
				 case '?' : break;
				 }
			 }
			 
		 }
		sc.close();
		
   }

}
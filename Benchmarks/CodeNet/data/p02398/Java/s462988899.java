import java.util.Scanner;

public class Main{
	 public static void main(String[] args) {
		 int n = 0;
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 for(int i=a;i<b+1;i++) {
			 if(c%i == 0)n++;
		 }
		 System.out.println(n);
	 }
}


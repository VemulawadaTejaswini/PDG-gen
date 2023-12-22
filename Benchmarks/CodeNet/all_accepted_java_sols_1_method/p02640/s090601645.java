import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int n=0;
	int m=0;
	 int bird=2;
	 int tirtle=4;
	 int sum=scanner.nextInt();
	 int legs=scanner.nextInt();

	 for(int i=0;i<=sum;i++) {
		 n=bird*i;
		 m=tirtle*(sum-i);
		 if(n+m==legs) {
			 System.out.println("Yes");
			 break;
		 }
		 if(i==sum) {
			 System.out.println("No");
		 }
	 }
	 }
}
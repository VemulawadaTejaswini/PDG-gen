import java.util.Scanner;
public class Main { 
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int a = sc.nextInt();
	 int k;
	 int i;
	 k=a/3;
	 for(i=1;i<=k;i++){
		 System.out.printf("%d ",3*i);
	 }
	 System.out.printf("\n");
 }
} 
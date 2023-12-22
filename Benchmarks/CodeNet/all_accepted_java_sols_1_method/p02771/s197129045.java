import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int count =0;

		if(n1 == n2){
			count++;
		}
		if(n1 == n3){
			count++;
		}
		if(n2 == n3){
			count++;
		}
		if(count == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		}
}
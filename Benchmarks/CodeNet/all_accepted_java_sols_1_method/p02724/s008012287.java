import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = 0;
		for(int i = 500;i<=x;x-=500) 
			result+=1000;
		for(int j = 5;j<=x;x-=5) 
			result+=5;
		
		System.out.println(result);
	}

}

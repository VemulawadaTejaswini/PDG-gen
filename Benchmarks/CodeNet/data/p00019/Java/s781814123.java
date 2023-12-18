import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 1;
		
		while(n > 1){
			t *= n--;
		}
		
		System.out.println(t);
	}

	public static void main(String[] args){
		Main test = new Main();
	}
}
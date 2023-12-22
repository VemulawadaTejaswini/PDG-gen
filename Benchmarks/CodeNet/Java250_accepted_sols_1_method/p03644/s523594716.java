import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		for(int i =0;i<=8;i++){
			if(Math.pow(2, i)<=N&&N<Math.pow(2, i+1)){
				System.out.println((int)Math.pow(2, i));
				break;
			}

		}

	}

}

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String result = "hon";
		while(N/10>0) {
			N=N%10;
		}
		if(N==3) {
			result ="bon";
		}else if(N==0||N==1||N==6||N==8){
			result ="pon";
		}
		System.out.println(result);
	}

}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int ones = N%10;
		String ans;
		if(ones == 3) {ans ="bon";}
		else if(ones==0 || ones==1 || ones==6 || ones==8) {ans="pon";}
		else {ans = "hon";}
		
		System.out.println(ans);
	}

}

import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s;
		if(a < b){
			s = "a < b";
		}else if(a > b){
			s = "a > b";
		}else{
			s = "a == b";
		}
		System.out.println(s);
	}
}

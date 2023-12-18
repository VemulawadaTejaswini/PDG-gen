import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean f = false;
		if(n%10==7){
			f = true;
		}
		if((n/10)%10==7){
			f = true;
		}
		if((n/100)%10==7){
			f = true;
		}
		if(f){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

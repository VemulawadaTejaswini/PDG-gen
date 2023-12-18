import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int a =kbd.nextInt();
		int b =kbd.nextInt();
		int c =kbd.nextInt();
		if(a<b && b<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
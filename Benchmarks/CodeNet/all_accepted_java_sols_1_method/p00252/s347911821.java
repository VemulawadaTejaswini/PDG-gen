import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a==1 && b==0 && c==0){
			System.out.println("Close");
		}else if(a==0 && b==1 && c==0){
			System.out.println("Close");
		}else if(a==1 && b==1 && c==0){
			System.out.println("Open");
		}else if(a==0 && b==0 && c==1){
			System.out.println("Open");
		}else if(a==0 && b==0 && c==0){
			System.out.println("Close");
		}
	}
}
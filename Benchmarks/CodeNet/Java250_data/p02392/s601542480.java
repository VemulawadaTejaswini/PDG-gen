import java.util.Scanner;
class Main{
    Scanner sc = new Scanner(System.in);
	
	int a;
	int b;
	int c;
	
	void bc2(){
		a = sc.nextInt();
	    b = sc.nextInt();
		c = sc.nextInt();
		
		if(a<b && b<c && a<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	public static void main(String[]agrs){
			new Main().bc2();
	}
}
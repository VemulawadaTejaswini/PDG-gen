import java.util.Scanner;

class Main{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		int a=0;
		int b=0;

		for(int i=0;i<4;i++){
			a += scan.nextInt();
		}

		for(int i=0;i<4;i++){
			b += scan.nextInt();
		}
	
		if(a>b){
			System.out.println(a);
		}
		else if(b>a){
			System.out.println(b);
		}
		else if(b==a){
			System.out.println(a);
		}
	
	}

}
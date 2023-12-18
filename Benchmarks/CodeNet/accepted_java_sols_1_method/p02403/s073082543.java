import java.util.*;

class Main{
	int a;
	int b;
	public Main(){
		Scanner scan = new Scanner(System.in);
		for(;;){
			a=scan.nextInt();
			b=scan.nextInt();
			if(a==0 || b==0)break;
			for(int j=0; j<a; j++){
				for(int i=0; i<b; i++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		new Main();
	}
}
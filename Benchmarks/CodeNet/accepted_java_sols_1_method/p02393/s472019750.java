import java.util.Scanner;
class Main {

	public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	
	int a = src.nextInt();
	int b = src.nextInt();
	int c = src.nextInt();
		for(int i=0; i<2; i++){
			if(b>c){
				int t = b;
				b = c;
				c = t;
			}
			if(a>b){
				int t = a;
				a = b;
				b = t;
			}
		}
	System.out.println(a+" "+b+" "+c);
	}
}
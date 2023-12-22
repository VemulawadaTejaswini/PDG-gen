import java.util.Scanner;

public class Main {
	
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		short i=1;
		while(true){
			int x=scanner.nextInt();
			int y=scanner.nextInt();
			int temp;
			
			if(x==0 && y==0)break;
			
			if(y<x){
				temp=x;
				x=y;
				y=temp;
			}
			System.out.print(x+" ");
			System.out.println(y);
			i++;
			
		}
		
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}
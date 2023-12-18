import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(true){
			int data= scanner.nextInt();
			if(data==0)
				break;
			
			System.out.println("Case "+Integer.toString(i++)+": "+Integer.toString(data));
		}
		scanner.close();
	}
}
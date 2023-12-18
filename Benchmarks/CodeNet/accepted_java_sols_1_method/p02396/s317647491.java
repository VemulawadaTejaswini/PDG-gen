import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i;
		
		for(int j=1; ; j++){
			if((i=in.nextInt()) == 0){
				break;
			}
			System.out.println("Case "+j+": "+i);
		}
		
		in.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input,i;
		
		i = 1;
		do{
			input = scan.nextInt();
			if(input > 0){
				System.out.println("Case "+i+": "+input);
			}
			i++;
		}while(input > 0);
		
	}

}
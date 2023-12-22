import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int max_number = 0;
			int max_value = 0;
			for(int i=0;i<n;i++){
				int number = stdIn.nextInt();
				int value = stdIn.nextInt()+stdIn.nextInt();
				if(max_value<value){
					max_number = number;
					max_value = value;
				}
			}
			System.out.println(max_number+" "+max_value);
		}
	}
}
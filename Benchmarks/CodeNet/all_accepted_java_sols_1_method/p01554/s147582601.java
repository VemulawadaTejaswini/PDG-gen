import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = Integer.valueOf(stdIn.nextLine());
		String[] u = new String[n];
		for(int i=0;i<n;i++){
			u[i] = stdIn.nextLine();
		}
		int m = Integer.valueOf(stdIn.nextLine());
		boolean open = false;
		for(int i=0;i<m;i++){
			String input = stdIn.nextLine();
			boolean match = false;
			for(int j=0;j<n;j++){
				if(input.equals(u[j])){
					if(open){
						System.out.println("Closed by "+input);
						open = false;
					}
					else{
						System.out.println("Opened by "+input);
						open = true;
					}
					match = true;
					break;
				}
			}
			if(!match){
				System.out.println("Unknown "+input);
			}
		}
	}
}
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n = cin.nextInt();
			n = n%39;
			if(n==0){
				System.out.println("3c"+39);
			}
			else{
				System.out.println("3c"+n);
			}
		}

	}

}
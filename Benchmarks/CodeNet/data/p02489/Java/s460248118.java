import java.util.Scanner; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		int i=1;
		while(x!=0){
			x=sc.nextInt();
			System.out.println("Case "+i+":"+" "+x);
			i++;
		}
		// TODO Auto-generated method stub

	}

}
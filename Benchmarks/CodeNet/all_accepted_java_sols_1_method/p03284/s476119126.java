import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Number of Atcoder crackers
        int n = sc.nextInt();

        //Number of mans
        int k = sc.nextInt();

        int answer = n % k;

        if(answer == 0){
        	System.out.println( answer );
        } else {
        	System.out.println( 1 );
        }
	}
}
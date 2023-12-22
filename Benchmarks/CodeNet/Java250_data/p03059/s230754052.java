import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int total = 0;
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int T = stdIn.nextInt();
        for(int i=1;;i++) {
        	if((T-i*A)>=0)
        		total += B;
        	else
        		break;
        } 
        System.out.println(total);
	}
}
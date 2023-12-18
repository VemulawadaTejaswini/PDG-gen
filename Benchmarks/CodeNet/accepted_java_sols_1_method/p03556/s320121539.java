import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(long i = 100000; i > 0; i--) {
		if(Math.pow(i, 2) <= n) {
			System.out.println((int)Math.pow(i, 2));
			break;
		}
	}
}
}

import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	for(int i=(int)Math.sqrt(n); i>=1; i--) {
		if(n%i == 0) {
			System.out.println(String.valueOf(n/i).length());
			break;
		}
	}
}
}
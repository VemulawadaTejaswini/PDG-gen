import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String bun;
		do {
		bun = stdIn.next();
		}while(bun.length()<1||bun.length()>100);
		int length = bun.length();
		int count = 0;
		int n;
		if(length %2==0) {
			n = length/2;
		}else {
			n = (length-1)/2;
		}
		for(int i=1 ; i<=n ; i++ ) {
			if(!(bun.substring(i-1,i).equals(bun.substring(length-i,length-i+1)))) {
				count++;
			}
		}
		System.out.println(count);
	}
}

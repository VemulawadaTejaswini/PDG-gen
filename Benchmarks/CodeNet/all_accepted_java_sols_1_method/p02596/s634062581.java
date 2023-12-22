
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	if(k%2==0||k%5==0) {
		System.out.println(-1);
	}else {
		
		int y=7;
			s:for(int i=1;;i++) {
			if(y%k==0) {
					System.out.println(i);
					break s;
				}
			y=(10*y+7)%k;
			}
	}
	}

}

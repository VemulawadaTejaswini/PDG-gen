import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long max = 1;
        int cnt = 1;
        long bef = A;
        for(int i=0;i<18;i++) max *= 10;
          //System.out.println(A + "," + B + "," + max);
        for (long i = bef + 1; i <= max; i++) {
            if (B < i ) break;
            if ( i >= 2*bef ) {
          //System.out.println("i = " + i);
              cnt++;
              bef = i;
              i *= 2;
              i--;
            }
        }
          System.out.print(cnt);
		
	}
}
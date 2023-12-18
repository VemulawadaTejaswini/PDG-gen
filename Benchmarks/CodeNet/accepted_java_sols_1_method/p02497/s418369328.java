import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,f,r,a=0;
		String c[] ={"A","B","C","D","F"};
		while(true){
			m = s.nextInt();
			f = s.nextInt();
			r = s.nextInt();
			
			if(m == -1 && f == -1 && r == -1) break;
			
			if(m == -1 || f == -1 || m+f < 30) a=4;
			else if(m+f >= 80) a=0;
			else if(m+f >= 65) a=1;
			else if(m+f >= 50 || r>= 50) a=2;
			else if(m+f >= 30) a=3;
			
			System.out.println(c[a]);
		}
	}

}
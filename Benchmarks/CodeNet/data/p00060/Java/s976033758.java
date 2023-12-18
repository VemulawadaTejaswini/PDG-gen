import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int cnt=0;
			
			for(int i=1; i<=10; i++){
				if(i==c1 || i==c2 || i == c3) continue;
				if(c1+c2+i<= 20) cnt++;
			}
			
			System.out.println((cnt/7.0 >= 0.5) ? "YES" : "NO");
		}
	}

}
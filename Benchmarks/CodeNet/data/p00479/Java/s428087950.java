import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x, y;
			for(int i=0;i<m;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				if(x>n/2) x = n-x+1;
				if(y>n/2) y = n-y+1;
				if(x>=y) System.out.println((y-1)%3+1);
				else System.out.println((x-1)%3+1);
			}
		}	
	}	
}
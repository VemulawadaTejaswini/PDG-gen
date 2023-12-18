import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m= Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count = 0;
		
			for(int i = 4; i <= m; i++) {
				for(int j = 2; j <= d/10; j++) {
				for(int k = 2; k <=9; k++) {
					if(j == d/10 && k > d%10) {
						break;
					}
					if(i==j*k) {
						//System.out.println(j*k);
						count++;
					}
				}
				}
			}
				System.out.println(count);
			}
	
}
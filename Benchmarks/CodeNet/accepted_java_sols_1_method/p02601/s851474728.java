
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ak = sc.nextInt();
		int mi = sc.nextInt();
		int ao = sc.nextInt();
		int k = sc.nextInt();

		for(int i=0;i<k;i++){
			if(ao <= mi || ao <= ak){
				ao *= 2;
			} else if(mi <= ak){
				mi *= 2;
			}
		}
		if(mi>ak && ao>ak && ao>mi){
			System.out.println("Yes");
		} else System.out.println("No");
		}
	}
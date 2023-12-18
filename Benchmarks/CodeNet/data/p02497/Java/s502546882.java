import java.util.*;

public class Main {
	public static void main(String[] args) {

		int m,f,r;
		String R = "";
		
		Scanner sc = new Scanner(System.in);

		while(true){
		
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			
			if(m == -1 && f == -1 && r == -1){
				break;
			}

			if (80 <= (m + f)){
				R = "A";
			} else if(65 <= (m + f) && (m + f) < 80){
				R = "B";
			} else if(50 <= (m + f) && (m + f) < 65){
				R = "C";
			} else if(30 <= (m + f) && (m + f) < 50){
				if (50 <= r){
				R = "C";
				} else {
				R = "D";
				}
			} else if((m + f) < 30 || ( m == -1 || f == -1 )){
				R = "F";
			}
			System.out.println(R);
		}
	}
}
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = 0;
		int f = 0;
		int r = 0;
		
		int count = 0;
		ArrayList<String> e = new ArrayList<String>();
		
		while(true){
			int i = 0;
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			
			if(m == -1 && f == -1 && r == -1){
					break;
			}else{
				if(m == -1 || f == -1){
					e.add("F");
				}else if(m + f >= 80){
					e.add("A");
				}else if(m + f >= 65 && m + f < 80){
					e.add("B");
				}else if(m + f >= 50 && m + f < 65){
					e.add("C");
				}else if(m + f >= 30 && m + f < 50){
					if(r >= 50){
						e.add("C");
					}else{
						e.add("D");
					}
				}else if(m + f < 30){
					e.add("F");
				}
			}
		}
		
		for(int j = 0; j < e.size(); j++){
			System.out.println(e.get(j));
		}
	}
}
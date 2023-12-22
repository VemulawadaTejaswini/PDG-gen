import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int out = 0;
			int r = 0;
			int sum = 0;
			String s = "";
			while(out<3){
				s = sc.next();
				if(s.compareTo("OUT")==0){
					out++;
				}else if(s.compareTo("HIT")==0){
					if(r==3){
						sum++;
					}else{
						r++;
					}
				}else{
					sum += r+1;
					r = 0;
				}	
			}
			System.out.println(sum);
		}
	
	}	
}
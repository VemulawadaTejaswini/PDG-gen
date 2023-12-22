import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, f, r;
		String s  = "";
		
		while(true){
			m = in.nextInt();
			f = in.nextInt();
			r = in.nextInt();
			if(m == -1 && f == -1 && r == -1) break;
			
			s = m==-1 || f==-1 ? "F" :
				m + f >= 80 ? "A" :
				m + f >= 65 ? "B" :
				m + f >= 50 ? "C" :
				m + f >= 30 ?
						r >= 50 ? "C" : "D" 
							: "F";
			
			System.out.println(s);
		}
	}

}
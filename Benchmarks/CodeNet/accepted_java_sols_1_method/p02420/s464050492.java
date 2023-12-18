import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		int m = 0;
		int h = 0;
		while(true){
			s.append(sc.next());
			if(s.toString().equals("-")){
				break;
			}
			m = sc.nextInt();
			for(int i = 0;i < m; i++){
				h = sc.nextInt();
				s.append(s.substring(0,h));
				s.delete(0,h);
			}
			System.out.println(s);
			s.delete(0, s.length());
		}

	}
}


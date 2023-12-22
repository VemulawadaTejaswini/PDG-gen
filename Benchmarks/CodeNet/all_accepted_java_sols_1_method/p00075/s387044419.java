import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			int a = Integer.valueOf(s[0]);
			double b = Double.valueOf(s[1]);
			double c = Double.valueOf(s[2]);
			if(b/(c*c)>=25){
				System.out.println(a);
			}
		}		
	}
}
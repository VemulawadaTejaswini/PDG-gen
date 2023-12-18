import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String x="";
		String y="";
		
		for(int i=0; i<n;i++){
			x = x + "" + m;
			}
		for(int o=0; o<m;o++){
			y = y + "" + n;
			}
		if(x.compareTo(y) < 0){
			System.out.println(x);
			}else if(y.compareTo(x) < 0){
				System.out.println(y);
			}else if(y.compareTo(x) == 0){
				System.out.println(y);
			}
		
		
	}
}
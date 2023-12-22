import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=0;
		for(int i=0;i<n;i++){
			String s = sc.next();
			String t = sc.next();
			if(s.compareTo(t)>0){
				a+=3;
			}else if(s.compareTo(t)<0){
				b+=3;
			}else{
				a++;
				b++;
			}
		}
		System.out.println(a + " " + b);
	}
}
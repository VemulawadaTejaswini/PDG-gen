import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max=-1;
		int min=1001;
		for(int i=0;i<a;i++) {
			int c=sc.nextInt();
			if(max<c)max=c;
			if(min>c)min=c;
		}
		System.out.println(max-min);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt(),b = in.nextInt();
			if(a+b==0)break;
			int x = Math.max(a, b),y = Math.min(a,b);
			int cnt = 0;
			while(y!=0){
				x = x%y;
				int t = x;
				x = y;
				y = t;
				cnt++;
			}
		System.out.println(x+" "+cnt);	
		}
	}
}
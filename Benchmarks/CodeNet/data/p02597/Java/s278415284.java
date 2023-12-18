import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			String str = sc.next();
			char[] chars =str.toCharArray();
			int p1 = 0, p2 = N-1;
			int op = 0;
			while(p1 < p2){
				while(p1 < p2 && chars[p1] =='R'){
					p1++;
				}
				while(p2 > p1 && chars[p2] =='W'){
					p2--;
				}
				if(p1 < p2){
					op++;
					p1++;
					p2--;
				}
			}
			System.out.println(op);
		}
	}
}
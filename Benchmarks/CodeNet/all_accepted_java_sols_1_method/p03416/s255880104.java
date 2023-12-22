import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		int a,b;
		int n,cnt = 0;
		ArrayList<Integer> keta = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		for(int i = a; i <= b; ++i){
			n = i;
			for(int j = 0; j < 5; ++j){
				keta.add(n % 10);
				n /= 10;
			}
			if(keta.get(0) == keta.get(4) && keta.get(1) == keta.get(3)){
				++cnt;
			}
			keta.clear();
		}
		System.out.println(cnt);
	}
}

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] list = new Data[n*2];
			for(int i = 0; i < n; i++) {
				int m = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				list[i*2] = new Data(m,a);
				list[i*2+1] = new Data(-m,b);
			}
			
			Arrays.sort(list,new MyComp());
			for(int i = 0; i < n*2-1; i++) {
				if(list[i].a == list[i+1].a) {
					list[i].m += list[i+1].m;
					list[i+1].m = 0;
				}
			}
			
			int sum = 0;
			boolean flg = false;
			for(int i = 0; i < n*2; i++) {
				sum += list[i].m;
				if(sum > 150) {
					flg = true;
					break;
				}
			}
			if(flg) {
				System.out.println("NG");
			}
			else {
				System.out.println("OK");
			}
		}
	}
	
	static class Data {
		int m;
		int a;
		Data(int c, int d) {
			m = c;
			a = d;
		}
	}
	
	static class MyComp implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {
			return o1.a - o2.a;
		}
		
	}
	
		
}
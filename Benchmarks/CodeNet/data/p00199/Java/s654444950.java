import java.util.*;
public class Main{

	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			Xist a = new Xist(n);
			for(int i = 0; i < m; i++) {
				String in = sc.next();
				if(in.equals("A")) a.A();
				if(in.equals("B")) a.B();
				if(in.equals("C")) a.C();
				if(in.equals("D")) a.D();
			}
			a.show();
		}
	}
	
	static class Xist {
		int[] list;
		Xist(int a) {
			list = new int[a];
		}
		
		void A() {
			for(int i = 0; i < list.length; i++) {
				if(list[i] == 0) {
					list[i] = 1;
					break;
				}
			}
		}
		void B() {
			for(int i = list.length-1; i >= 0; i--) {
				if(i+1 < list.length && i - 1 >= 0 && list[i+1] != 1 && list[i-1] != 1 && list[i] == 0) {
					list[i] = 2;
					return;
				}
				if(i+1 >= list.length && i - 1 >= 0 && list[i-1] != 1 && list[i] == 0) {
					list[i] = 2;
					return;
				}
				if(i+1 < list.length && i - 1 < 0 && list[i+1] != 1 && list[i] == 0) {
					list[i] = 2;
					return;
				}
			}
			for(int i = 0; i < list.length; i++) {
				if(list[i] == 0) {
					list[i] = 2;
					return;
				}
			}
		}
		void C() {
			for(int i = 0; i < list.length; i++) {
				if(list[i] != 0 && i+1 < list.length && list[i+1] == 0) {
					list[i+1] = 3;
					return ;
				}
				if(list[i] != 0 && i-1 >= 0 && list[i-1] == 0) {
					list[i-1] = 3;
					return ;
				}
			}
			
			if(list.length % 2 == 0) {
				list[((list.length/2)+1) -1] = 3;
				return;
			}
			if(list.length % 2 == 1) {
				list[((list.length+1)/2) -1] = 3;
				return;
			}
		}
		void D() {
			int[] d = new int[list.length];
			Arrays.fill(d, 2 << 25);
			for(int i = 0; i < list.length; i++) {
				if(list[i] != 0) {
					d[i] = 0;
					for(int j = i+1; j < list.length; j++) {
						if(d[j] <= Math.abs(i - j)) break;
						d[j] = Math.abs(i - j);
					}
					for(int j = i-1; j >= 0; j--) {
						if(d[j] <= Math.abs(i - j)) break;
						d[j] = Math.abs(i - j);
					}
				}
			}
			
			if(d[0] == 2 << 25) {
				list[0] = 4;
				return;
			}
			int max = 0;
			int sel = 0;
			for(int i = 0; i < list.length; i++) {
				if(max < d[i]) {
					max = d[i];
					sel = i;
				}
			}
			list[sel] = 4;
			
		}
		void show() {
			for(int i = 0; i < list.length; i++) {
				if(list[i] == 0) { 
					System.out.print("#");
				}
				if(list[i] == 1) {
					System.out.print("A");
				}
				if(list[i] == 2) {
					System.out.print("B");
				}
				if(list[i] == 3) {
					System.out.print("C");
				}
				if(list[i] == 4) {
					System.out.print("D");
				}
			}
			System.out.println();
		}
		
	}
}
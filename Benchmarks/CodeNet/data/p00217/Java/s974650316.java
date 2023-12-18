import java.util.*;


class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			Data[] list = new Data[n];
			for(int i = 0; i < n; i++) {
				int p = stdIn.nextInt();
				int d1 = stdIn.nextInt();
				int d2 = stdIn.nextInt();
				list[i] = new Data(p,d1,d2);
			}
			Arrays.sort(list,new Comp());
			
			System.out.println(list[0].id + " " + list[0].d1);
		}
 	}
	static class Comp implements Comparator<Data>{
		public int compare(Data o1, Data o2) {
			if(o1.d1 > o2.d1) {
				return -1;
			}
			else {
				return 1;
			}
		}
		
	}
	static class Data{
		int id;
		int d1;
		Data(int a, int b, int c) {
			id = a;
			d1 = b+c;
		}
		
	}
}
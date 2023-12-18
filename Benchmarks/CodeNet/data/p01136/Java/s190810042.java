import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args){
		while(true){
			int n = si();
			if(n==0) break;
			ListArray[] lista = new ListArray[30];
			for(int i=0;i<30;i++) lista[i] = new ListArray();
			long[] map = new long[n];
			int res = -1;
			for (int i = 0; i < n; i++) {
				int m = si();
				map[i]=1L<<i;
				for (int j = 0 ;j < m ; j++)
					lista[si()-1].list.add(i);
			}
			for (int i = 0; i < 30; i++) {
				long tmp = 0;
				for (Integer e : lista[i].list)
					tmp |= map[e];
				for (Integer e : lista[i].list)
					map[e]=tmp;
				if(tmp==(1L<<n)-1){
					res = i+1;
					break;
				}
			}
			out.println(res);
		}
		out.flush();
	}
	static int si(){
		return Integer.parseInt(scan.next());
	}
}

class ListArray{
	ArrayList<Integer> list = new ArrayList<Integer>(50);
}
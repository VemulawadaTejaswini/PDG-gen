import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0;i<T;i++) {
			int N = sc.nextInt();
			Main main = new Main();
			List<Number> a = new ArrayList<Number>();
			List<Number> b = new ArrayList<Number>();
			for (int j=0;j<N;j++) {
				Number temp = main.new Number();
				temp.K= sc.nextInt();
				temp.L= sc.nextLong();
				temp.R = sc.nextLong();
				temp.sa= Math.abs(temp.L-temp.R);
				if (temp.L>temp.R) {
					temp.b= true;
					a.add(temp);
				} else {
					temp.b= false;
					b.add(temp);
				}
			}
			Collections.sort(a);
			Collections.sort(b);
			long sum =0;
			int t[]= new int[N+1];
			int j1=0;
			int j2=0;
			while (j1<a.size()&&j2<b.size()) {
				Number tempa= a.get(j1);
				Number tempb= b.get(j2);
				boolean bo = false;
				if (tempa.sa>tempb.sa) {
					for (int k =tempa.K;k>0;k--) {
						if (t[k]==0) {
							bo = true;
							t[k]=1;
							sum +=tempa.L;
							break;
						}
					}
					if (bo ==false) {
						sum +=tempa.R;
					}
					j1++;
				} else {
					for (int k =tempb.K+1;k<=N;k++) {
						if (t[k]==0) {
							bo = true;
							t[k]=1;
							sum +=tempb.R;
							break;
						}
					}
					if (bo ==false) {
						sum +=tempb.L;
					}
					j2++;
				}
			}
			for (;j1<a.size();j1++) {
				Number temp = a.get(j1);
				boolean bo = false;
				for (int k =temp.K;k>0;k--) {
					if (t[k]==0) {
						bo = true;
						t[k]=1;
						sum +=temp.L;
						break;
					}
				}
				if (bo ==false) {
					sum +=temp.R;
				}
			}
			for (;j2<b.size();j2++) {
				Number temp = b.get(j2);
				boolean bo = false;
				for (int k =temp.K+1;k<=N;k++) {
					if (t[k]==0) {
						bo = true;
						t[k]=1;
						sum +=temp.R;
						break;
					}
				}
				if (bo ==false) {
					sum +=temp.L;
				}
			}
			System.out.println(sum );
		}
	}
	public class Number implements Comparable<Number>{
		int K;
		long L;
		long R;
		long sa;
		boolean b;
		@Override
		public int compareTo(Number o) {
			if (this.sa>o.sa) {
				return 1;
			} else if (this.sa==o.sa &&this.K<o.K && b==true) {
				return 1;
			} else if (this.sa==o.sa &&this.K>o.K && b==false) {
				return 1;
			}
			return -1;
		}
	}
}
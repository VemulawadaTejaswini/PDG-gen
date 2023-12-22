import java.util.HashSet;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			HashSet<Integer> ret = new HashSet<Integer>();
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			int x = 400;
			int plus = 0;
			
			for(int i=0;i<n;i++) {
				if(a[i]<x) {
					ret.add(x);
				}else if(a[i]<2*x) {
					ret.add(2*x);
				}else if(a[i]<3*x) {
					ret.add(3*x);
				}else if(a[i]<4*x) {
					ret.add(4*x);
				}else if(a[i]<5*x) {
					ret.add(5*x);
				}else if(a[i]<6*x) {
					ret.add(6*x);
				}else if(a[i]<7*x) {
					ret.add(7*x);
				}else if(a[i]<8*x) {
					ret.add(8*x);
				}else {
					plus++;
				}
			}
			
			if(ret.size()==0) {
				System.out.println(1+" "+(ret.size()+plus));
			}else {
				System.out.println(ret.size()+" "+(ret.size()+plus));
			}
			
		}	
	}
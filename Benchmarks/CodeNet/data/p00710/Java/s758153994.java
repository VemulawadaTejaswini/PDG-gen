import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> set= new ArrayList<Integer>();
		int tmp;
		ArrayList<Integer> result=new ArrayList<Integer>();
		int n=in.nextInt();
		int r=in.nextInt();
		int c,p;
		while (!(n==0 && r==0)) {
			for (int i=0;i<n;i++) {
				set.add(i+1);
			}
			for (int i=0;i<r;i++) {
				p=in.nextInt();
				c=in.nextInt();
				for (int j=0;j<c;j++) {
					tmp=set.get(n-p-c+1);
					set.add(tmp);
					set.remove(n-p-c+1);
				}
			}
			result.add(set.get(set.size()-1));
			n=in.nextInt();
			r=in.nextInt();
			set.clear();
		}

		for (int i=0;i<result.size();i++) {
			System.out.printf("%d%n",result.get(i));
		}
	}
}
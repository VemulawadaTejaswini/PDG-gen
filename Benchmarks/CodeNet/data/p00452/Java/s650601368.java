import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

//Darts
public class Main{

	static int upperBound(int[] a, int x){
		int left = 0;
		int right = a.length;
		while(true){
			if(right-left<=1){
				return a[left]>x?left:right;
			}
			else{
				int m = (left+right)/2;
				if(a[m]>x){
					right = m;
				}
				else{
					left = m;
				}
			}
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0)break;
			int[] p = new int[n];
			for(int i=0;i<n;i++)p[i]=sc.nextInt();
			SortedSet<Integer> set = new TreeSet<Integer>();
			set.add(0);
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					set.add(p[i]);
					set.add(p[j]);
					set.add(p[i]+p[j]);
				}
			}
			int[] a = new int[set.size()];
			int id = 0;
			for(Integer i:set)a[id++]=i;
			int max = 0;
			for(Integer i:set){
				if(m<i)break;
				id = upperBound(a, m-i);
//				if(id==a.length)continue;
//				System.out.println("SUM:" + (i+a[id-1]) + " I:" + i + " A:" + a[id-1]);
				max = Math.max(max, i+a[id-1]);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
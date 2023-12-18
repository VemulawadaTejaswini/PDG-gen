import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Citation Format
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			for(int i=0;i<n;i++)a[i]=sc.nextInt();
			int s = a[0];
			Queue<String> l = new LinkedList<String>();
			for(int i=1;i<n;i++){
				if(i==n-1){
					if(a[i-1]+1==a[i])l.add(s+"-"+a[i]);
					else {
						l.add(s+"");
						l.add(a[i]+"");
					}
				}
				else if(a[i]>a[i-1]+1){
					if(s==a[i-1])l.add(s+"");
					else l.add(s+"-"+a[i-1]);
					s = a[i];
				}
			}
			boolean f = true;
			while(!l.isEmpty()){
				if(!f)System.out.print(" ");
				f = false;
				System.out.print(l.poll());
			}
			System.out.println();
		}
	}
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int a;
	static int b;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		List<Integer> list =new ArrayList<Integer>();
		for(int n=0;n<K;n++) {
			int d=sc.nextInt();
			for(int m=0;m<d;m++) {
				list.add(sc.nextInt());
			}
		}
		list=new ArrayList<Integer>(new HashSet<>(list));
		a=list.size();
		b=N-a;
		System.out.println(b);
	}
}

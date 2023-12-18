import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextInt();
		long M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer> ();
		int m[] = new int[(int)M];
		long sum=0;
		long i=0;
		for (i=0;i<N;i++) {
			m[(int)X] = (int)i+1;
			list.add((int)X);
			sum =sum +X;
			X = (X*X)%M;
			if (m[(int)X]>0 &&i<N-1) {
				break;
			}
		}
		if (i==N) {
			System.out.println(sum);
			return ;
		}
		long temp =0;
		int t = m[(int)X];
		for (t =t-1;t<list.size();t++) {
			temp += list.get(t);
		}
		sum = ((N-list.size())/(list.size()-m[(int)X]+1))*temp+sum ;
		for (int j=0;j<((N-list.size())%(list.size()-m[(int)X]+1));j++) {
			sum +=list.get(j+m[(int)X]-1);
		}
		System.out.println(sum );
	}
}
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		int M=sc.nextInt();
		long B[]=new long[M];
		long K=sc.nextLong();
		for(int i=0;i<N;i++)
			A[i]=sc.nextLong();
		for(int i=0;i<M;i++)
			B[i]=sc.nextLong();
		sc.close();
		int book=0;
		int i=0;
		while(i<N&&K>=A[i]) {
				K-=A[i];
				book++;
				i++;
				System.out.println(i);
		}
		int j=0;
		while(j<M&&K>=B[j]) {
			K-=B[j];
			book++;
			j++;
			System.out.println(j);
		}
		int bookMAX=book;
		i--;
		while(i>=0&&j<M){
			K+=A[i];
			i--;
			book--;
			while(j<M&&K>B[j]) {
				book++;
				K-=B[j];
				j++;
				if(bookMAX<book)
					bookMAX=book;
			}
		}
		System.out.println(bookMAX);
	}
}

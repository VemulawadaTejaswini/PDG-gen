import java.util.Scanner;
class Main {
	public static void main(String[] args){
		final int Number=100;
		try(Scanner sc = new Scanner(System.in)){
			int N = Integer.parseInt(sc.next());
			int[] p=new int[N];
			for(int i=0;i<N;i++) p[i] = Integer.parseInt(sc.next());
			int cnt=0;
			for(int i=0;i<N;i++){
				for(int j=N-1;j>i;j--){
					if(p[j]<p[j-1]){
						cnt++;
						int tmp=p[j-1];
						p[j-1]=p[j];
						p[j]=tmp;
					}
				}
			}
			
			
			System.out.print(p[0]);
			for(int i=1;i<N;i++)System.out.print(" "+p[i]);
			System.out.println();
			System.out.println(cnt);
		}
	}
}
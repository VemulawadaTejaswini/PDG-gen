import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<50000;++i) {
			if((int)(i*1.08)==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(":(");
	}
}

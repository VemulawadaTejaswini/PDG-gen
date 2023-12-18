import java.util.Scanner;

//time:: 16:44~16:56

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m=sc.nextInt();
			int nmin=sc.nextInt();
			int nmax=sc.nextInt();
			if((m==0&&nmin==0)&&nmax==0) break;
			Integer[] point = new Integer[m];
			for(int i=0;i<m;++i){
				point[i]=sc.nextInt();
			}
			int gap=-1,res=-1;
			for(int i=nmin-1;i<nmax;++i){
				if(gap<point[i]-point[i+1]){
					gap=point[i]-point[i+1];
					res=i;
				} else if(gap==point[i]-point[i+1]&&res<i){
					res=i;
				}
			}
			System.out.println(res+1);
		}
	}

}

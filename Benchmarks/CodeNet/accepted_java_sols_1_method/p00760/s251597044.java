import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;++i){
			int yi=sc.nextInt();
			int mi=sc.nextInt();
			int di=sc.nextInt();
			int count=0,flag=0;
			for(int y=1;y<1000;++y){
				if(yi==y) flag++;
				for(int m=1;m<=10;++m){
					if(flag==1 && mi==m) flag++;
					for(int d=1;d<=20;++d){
						if(flag==2 && di==d) flag++;
						if((y%3!=0 && m%2==0) && d==19) d=21;
						if(flag==3) count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

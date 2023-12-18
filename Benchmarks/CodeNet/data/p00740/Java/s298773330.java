import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==0&&p==0) break;
			int[] st = new int[n];
			int flag=0,flag2=0,end=p;
			while(true){
				if(p==0){
					p=st[flag];
					st[flag]=0;
				} else {
					st[flag]+=1;
					p--;
					if(p==0){
						for(int i=0;i<n;++i){
							if(st[i]==end){
								System.out.println(i);
								flag2=1;
								break;
							}
						}
					}
				}
				if(flag2==1) break;
				flag++;
				if(flag==n) flag=0;
			}
		}
	}
}

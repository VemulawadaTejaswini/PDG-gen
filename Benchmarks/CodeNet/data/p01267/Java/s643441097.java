import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int x=sc.nextInt();
			if(n+a+b+c+x==0) break;
			int y[]=new int[n];
			for(int i=0; i<n; i++){
				y[i]=sc.nextInt();
			}
			int j=0;
			boolean flag=false;
			for(int i=0; i<=10000; i++){
				if(y[j]==x){
					y[j]=-1;
					j++;
				}
				if(check(y)){
					flag=true;
					System.out.println(i);
					break;
				}
				x=(a*x+b)%c;
			}
			if(!flag){
				System.out.println("-1");
			}
		}
	}
	static boolean check(int y[]){
		for(int i=0; i<y.length; i++){
			if(y[i]!=-1){
				return false;
			}
		}
		return true;
	}

}
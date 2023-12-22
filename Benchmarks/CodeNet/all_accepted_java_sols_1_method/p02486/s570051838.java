import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner stdin=new Scanner(System.in);
		while(true){
			int count=0;
			int n=stdin.nextInt();
			int x=stdin.nextInt();
			if(n==0) break;
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x) count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
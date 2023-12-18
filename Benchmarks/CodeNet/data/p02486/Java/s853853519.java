import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w=0;
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0&&x==0){
				break;
			}else{
				if(x>3*n-3||x<6){
					System.out.println("0");
				}else{
					for(int i=n;i>=3;i--){
						for(int j=i-1;j>=2;j--){
							if(2*j>x-i&&x>i+j){
								w++;
							}
						}
					}
					System.out.println(w);
				}
			}
		}
	}
}
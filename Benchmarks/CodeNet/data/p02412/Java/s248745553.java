import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int x=sc.nextInt();
		int p1,p2,p3;
		int cnt=0;
		while(n!=0 || x!=0){
			for(p1=1;p1<=n;p1++){
				for(p2=1;p2<=n;p2++){
					if(((p1+p2)>=x) ||(p1==p2)) break;
					for(p3=1;p3<=n;p3++){
						if(((p1+p2+p3)>x)||(p2==p3)){
							break;
						}else if((p1+p2+p3)==x){
							cnt++;
						}
					}//for	
				}//for
			}//for
			System.out.println(cnt);
			cnt=0;
			n=sc.nextInt();
			x=sc.nextInt();
		}//while
	}

}
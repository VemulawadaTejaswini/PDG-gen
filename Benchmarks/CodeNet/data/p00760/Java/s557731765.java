import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner  scan = new Scanner(System.in);
			int n=0,y=0,m=0,d=0,day=0,days=1,man=0;
			n=scan.nextInt();
			while(n!=0){
				y=scan.nextInt();
				m=scan.nextInt();
				d=scan.nextInt();
				for(int i=999;y<=i;i--){
					if(y==i){
						man=m;
						day=d;
					}else {
						man=10;
						day=1;
					}
					for(int j=10;man<=j;j--){
						if(y%3==0){
							for(int k=20;day<k;k--){
								days++;
							}
						}else{
							if(j%2!=0){
								for(int k=20;day<k;k--){
									days++;
								}
							}else {
								for(int k=19;day<k;k--){
									days++;
								}
							}
						}
					}
				}
				n--;
				System.out.println(days);
			}

	}
}


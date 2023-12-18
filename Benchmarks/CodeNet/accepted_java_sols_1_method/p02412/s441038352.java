import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = sc.nextInt();
			int s;
			while(n!=0 || x!=0){
				s=0;
				for(int c=1;c<=n-2;++c){
					for(int d=c+1;d<=n-1;++d){
						for(int e=d+1;e<=n;++e){
							if(c+d+e==x){
								s=s+1;
							}
						}
					}
				}
				System.out.println(s);
				n = sc.nextInt();
				x = sc.nextInt();
			}
	}

}
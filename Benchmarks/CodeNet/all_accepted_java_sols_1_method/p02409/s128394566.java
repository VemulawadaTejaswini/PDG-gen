import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int []c = new int[340];		
			
			for(int a = 1 ; a <= n ; ++a){
				int b = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();
				int v = sc.nextInt();
				
				if (b==1){
					c[10*f+(r-1)]=c[10*f+(r-1)]+v;
				}else if (b==2){
					c[100*(b-1)+10*f+(r-1)]=c[100*(b-1)+10*f+(r-1)]+v;
				}else if (b==3){
					c[100*(b-1)+10*f+(r-1)]=c[100*(b-1)+10*f+(r-1)]+v;
				}else if (b==4){
					c[100*(b-1)+10*f+(r-1)]=c[100*(b-1)+10*f+(r-1)]+v;
				}
				
			}
			for(int a = 0 ; a <= 3 ; ++a){
				for(int d = 1 ; d <= 3 ; ++d){
					for(int e = 0 ; e <= 9 ; ++e){
						System.out.print(" "+c[100*a+10*d+e]);
					}
					System.out.println();
				}
				if(a!=3){
					System.out.println("####################");
				}
			}
	}

}
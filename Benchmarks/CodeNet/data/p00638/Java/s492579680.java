
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int zaihou = 0;
		int hasi =0;
		int nowhasi = 0;
		int i = 0;
		for(int kk=0;kk<1000000;kk++){
			int n = sc.nextInt();
			if(n==0){
				System.exit(0);
			}else{
				for(i=0;i<n;i++){
					zaihou = zaihou+sc.nextInt();
					nowhasi = sc.nextInt();
					if(nowhasi>hasi){
						hasi = nowhasi;
					}
				}
				if(hasi>=zaihou){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}
	}

}
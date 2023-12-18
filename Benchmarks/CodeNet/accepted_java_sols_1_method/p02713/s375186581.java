import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int K=scan.nextInt();
		int total=0;
		for(int i=1;i<=K;i++){
			for(int j=1;j<=K;j++){
				for(int k=1;k<=K;k++){
					int min=Math.min(Math.min(i,j),Math.min(j,k));
					int gcd=1;
					for(int l=1;l<=min;l++){
						if(i%l==0&&j%l==0&&k%l==0){
							gcd=l;
						}
					}
					total+=gcd;
				}
			}
		}
		System.out.println(total);

	}

}

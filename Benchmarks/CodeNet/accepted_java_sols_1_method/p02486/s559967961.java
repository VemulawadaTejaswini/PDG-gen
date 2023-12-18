import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i,j,k;
		int n,x;
		int count;
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n==0&&x==0){
				break;
			}
			count=0;
			for(i=1; i<=n; i++){
				for(j=1; j<=n; j++){
					for(k=1; k<=n; k++){
						if(i+j+k==x){
							if(i!=j&&j!=k&&k!=i){
								count++;
							}
						}
					}
				}
			}
			count/=6;
			System.out.println(count);
		}

	}

}
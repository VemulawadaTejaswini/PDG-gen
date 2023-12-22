import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans,cnt=0;
		int n=sc.nextInt();
		int x=sc.nextInt();
		while(n!=0 || x!=0){
			cnt=0;
			for(int i=1; i<n-1; i++){
				for(int j=i+1; j<n; j++){
					for(int k=j+1; k<n+1; k++){
						ans=i+j+k;
						if(ans==x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
			n=sc.nextInt();
			x=sc.nextInt();
		}
		// TODO Auto-generated method stub

	}

}
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			int ans=0;
			int year = cin.nextInt();
			int month = cin.nextInt();
			int day = cin.nextInt();
			for(int i = year+1; i <= 999; i++){
				if(i%3==0){
					ans += 200;
				}
				else{
					ans += 195;
				}
			}
			for(int i = month+1; i <= 10; i++){
				if(year%3!=0){
					if(i%2==0){
						ans += 19;
					}
					else{
						ans += 20;
					}
				}
				else{
					ans += 20;
				}
			}
			for(int i = day; i <= 20; i++){
				if(i == 20 && year%3!=0 && month%2==0)
					break;
				ans++;
			}
			System.out.println(ans);
		}
	}

}
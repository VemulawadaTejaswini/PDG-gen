
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			int ans=0;
			if(N==-1){
				break;
			}
			if(N<=10){
				ans=1150;
			}
			else if(N<=20){
				ans+=1150;
				N-=10;
				ans+=N*125;
			}
			else if(N<=30){
				ans+=1150;
				ans+=10*125;
				N-=20;
				ans+=N*140;
			}
			else{
				ans+=1150;
				ans+=10*125;
				ans+=10*140;
				N-=30;
				ans+=N*160;
			}
			System.out.println(4280-ans);
		}

	}

}
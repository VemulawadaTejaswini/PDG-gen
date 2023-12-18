import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int coin[]={500,100,50,10,5,1};
		while(true){	
			int x,ans = 0;
				x=cin.nextInt();
					if(x==0){
						break;
					}
				x=1000-x;
					for(int c: coin){
						ans=ans+x/c;
						x=x%c;
					}
				System.out.println(ans);
		}
	}
}

	
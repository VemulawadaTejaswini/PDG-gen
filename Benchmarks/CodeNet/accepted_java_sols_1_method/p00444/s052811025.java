import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int coin[]={500,100,50,10,5,1};
		int change,i,count,n;
		while(true){
			count=0;
			n=sc.nextInt();
			if(n==0) break;
			change=1000-n;
			for(i=0;i<6;i++){
				for(;;){
					if(coin[i]<=change){
						change-=coin[i];
						count++;
					}
					else break;
				}
				if(change==0) break;
			}
			System.out.println(count);
		}
	}
}
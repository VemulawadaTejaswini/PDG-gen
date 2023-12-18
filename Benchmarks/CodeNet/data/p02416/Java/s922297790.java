import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int x,ans;
		while(true){
			x=scan.nextInt();
			ans=0;
			if(x==0) break;
			ans+=(x/1000);
			x=x-((x/1000)*1000);
			ans+=(x/100);
			x=x-((x/100)*100);
			ans+=(x/10);
			x=x-((x/10)*10);
			ans+=x;
			System.out.println(ans);
		}
		scan.close();
	}
}
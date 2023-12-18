import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	Scanner cin = new Scanner(System.in);
	while(true){
		if(!cin.hasNext()){
			break;
		}
		double x,ans;
		x=cin.nextDouble();
		ans=x;
		for(int i=2;i<11;i++){
			if(i%2==0){
				x=x*2;
				ans=ans+x;
			}
			else{
				x=x/3;
				ans=ans+x;
			}
		}
		System.out.println(ans);
	}
	}

}
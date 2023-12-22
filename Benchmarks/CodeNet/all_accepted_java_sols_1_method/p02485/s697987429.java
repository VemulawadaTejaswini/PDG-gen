import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			String x;
			int ans=0;
			x=cin.nextLine();
			if(x.equals("0")){
				break;
			}
			for(int i=0;i<x.length();i++){
				char s=x.charAt(i);
				ans=ans+s-48;
			}
			System.out.println(ans);
		}
	}

}
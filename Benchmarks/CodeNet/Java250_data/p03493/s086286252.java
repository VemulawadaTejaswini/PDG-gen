import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String strr;
		int ans=0;
		for(int i=0;i<3;i++){strr=str.substring(i,i+1);
			if(strr.equals("1")){
			ans = ans + 1;	
			}
		}System.out.println(ans);
	}
}
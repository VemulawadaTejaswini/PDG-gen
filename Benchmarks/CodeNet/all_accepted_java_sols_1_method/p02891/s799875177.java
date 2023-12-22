import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = (long)sc.nextInt();

		int[] n = new int[100];
		int chKind = 0;
		int chNum = 0;

		long ans = 0;

		char tmp = s.charAt(0);

		for(int i = 0 ; i < s.length() ; i++){
			if(tmp == s.charAt(i)){
				chNum++;
			}else{
				n[chKind] = chNum;
				chKind++;
				chNum = 1;
				tmp = s.charAt(i);
			}
		}
		n[chKind] = chNum;
		chKind++;

		if(chKind == 1){
			ans = n[0]*k/2;
		}else if(s.charAt(0) != s.charAt(s.length()-1)){
			for(int i = 0 ; i < chKind ; i++){
				ans += n[i]/2;
			}
			ans = ans*k;
		}else{
			for(int i = 1 ; i < chKind-1 ; i++){
				ans += n[i]/2;
			}
			ans = k*ans;
			ans += (k-1)*((n[0]+n[chKind-1])/2) + (n[0]/2) + (n[chKind-1]/2);
		}

		System.out.println(ans);
	}

}
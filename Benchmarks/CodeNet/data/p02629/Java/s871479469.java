import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long N=sc.nextInt();
		ArrayList<String> ans = new ArrayList<String>();
		do{
          	int temp;
          	if(N>=26) temp=(int)(N % 26);
          	else temp=(int)N;
			N/=26;
			if(temp!=0) {
				temp=0x60+temp;
				String t = String.valueOf(Character.toChars(temp));
				ans.add(0, t);
            }
			else ans.add(0,String.valueOf('z'));
		}while (N>0);
		for(String a:ans) {
			System.out.print(a);
		}
	}
}
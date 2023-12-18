import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(;;){
		int x = scan.nextInt();
		if(x == 0)
			break;
		Integer a = new Integer(x);
		String str = a.toString();
		String b[] = str.split("");
		int i,m,ans;
		ans = 0;
		for(i = 0; i < str.length(); i++){
			for(m = 0; m <= 9; m++){
				Integer num = new Integer(m);
				String str2 = num.toString();
				if(b[i].equals(str2))
					ans += m;
			}
		}
		System.out.println(ans);
		}
		
	}
}
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn =new Scanner (System.in);
		String a=stdIn.next();
		String b=stdIn.next();
		int alen=a.length();
		int blen=b.length();
		String c="";
		for(int i=0;i<alen+blen;i++){
			if(i%2==0)
				c+=a.charAt(i/2);
			else
				c+=b.charAt(i/2);
			
		}
		System.out.println(c);
		}
}
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0208();
	}
	
	class AOJ0208{
		public AOJ0208() {
			char[] table = {'0','1','2','3','5','7','8','9'};
			while(true){
				long n = in.nextLong();
				if(n==0)break;
				String a = Long.toOctalString(n);
				String result = "";
				for(int i=0;i<a.length();i++){
					result+=table[Integer.parseInt(a.charAt(i)+"")];
				}
				System.out.println(result);
			}
		}
	}
}
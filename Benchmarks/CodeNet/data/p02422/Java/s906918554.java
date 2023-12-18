import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		Trans t = new Trans(str);
		String command="";
		for(int i = 0 ; i < n ; i ++){
			command=sc.next();
			if(command.equals("print"))
				t.print(sc.nextInt(), sc.nextInt());
			else if(command.equals("replace"))
				t.rePlace(sc.nextInt(), sc.nextInt(), sc.next());
			else if(command.equals("reverse"))
				t.reverse(sc.nextInt(), sc.nextInt());
		}
	}

}
class Trans{
	private String str;
	Trans(String s){
		str = s;
	}
	void print(int a,int b){
		System.out.println(str.substring(a, b+1));
	}
	void rePlace(int a, int b, String s){
		String before = str.substring(0, a);
		String after = str.substring(b+1, str.length());
		str=before+s+after;
		//System.out.println(str);
	}
	void reverse(int a, int b){
		String before = str.substring(0, a);
		String after = str.substring(b+1, str.length());
		String remid="";
		for(int i = b-a ; i >= a ; i --){
			remid+=str.charAt(i);
		}
		str=before+remid+after;
		//System.out.println(str);
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();

        MinorChange a=new MinorChange(s,t);
        System.out.println(a.toString());
	}

}

class MinorChange{
	char [] s;
	char [] t;
	private int count;
	
	MinorChange(String s,String t){
		this.s=s.toCharArray();
		this.t=t.toCharArray();
		
		count(this.s,this.t,s);
		
	}
	void count(char []s,char[]t,String str) {
		
		for(int i=0;i<str.length();i++) {
			if(s[i]!=t[i]) count++;
		}
		
	}
	public String toString() {
		return count+"";
	}
}
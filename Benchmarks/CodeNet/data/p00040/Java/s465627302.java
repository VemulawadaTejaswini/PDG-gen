import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int n=sc.nextInt();sc.nextLine();
		while (n--!=0) {
			String str = sc.nextLine();

			String res="";
			for(int a=1;a<26;a++)for(int b=0;b<26;b++){
				String ans=getAffine(str, a, b);
				if(ans.contains("this") ||ans.contains("that")){
					res=ans;
					break;
				}
			}
			ln(res);
		}
	}
	public String getAffine(String s,int a,int b){
		char[] cs=s.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(Character.isLowerCase(cs[i]))
				cs[i]=(char)((a*(cs[i]-'a')+b)%26+'a');
		}
		return String.copyValueOf(cs);
	}


	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}
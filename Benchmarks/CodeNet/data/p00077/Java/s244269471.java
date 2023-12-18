import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNextLine()){
			char[] str=sc.nextLine().toCharArray();
			StringBuilder res=new StringBuilder();
			for(int i=0;i<str.length;i++){
				if(str[i]=='@'){
					i++;
					int n=str[i]-'0';
					i++;
					for(int j=0;j<n;j++){
						res.append(str[i]);
					}
				}else{
					res.append(str[i]);
				}
			}
			ln(res);
		}
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
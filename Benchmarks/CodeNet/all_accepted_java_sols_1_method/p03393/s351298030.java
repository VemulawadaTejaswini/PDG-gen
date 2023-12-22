import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();


		if(s.equals("zyxwvutsrqponmlkjihgfedcba"))
			System.out.print(-1);
		else {


			int n= s.length();
			char ch[]=new char[n+1];
			for(int i=0;i<n;i++) {
				ch[i]=s.charAt(i);
			}
			ch[n]=0;

			if(n==26) {
				int shou=0;
				for(int i=25;i>=0;i--) {
					if(ch[i]>ch[i-1]) {
						shou=i-1;
						break;
					}
				}
				for(int i=25;i>shou;i--) {
					if(ch[i]>ch[shou]) {
						ch[shou]=ch[i];
						break;
					}
				}

				for(int i=0;i<=shou;i++) {
					System.out.print(ch[i]);
				}
			}
			else {
				boolean hantei=true;
				for(char c=97;c<=123;c++) {
					for(int j=0;j<n;j++) {
						if(c==ch[j]) {
							hantei=false;
							break;
						}
					}
					if(hantei) {
						ch[n]=c;
						break;
					}
					hantei=true;
				}

				for(int i=0;i<=n;i++) {
					System.out.print(ch[i]);
				}
			}
		}

	}

}

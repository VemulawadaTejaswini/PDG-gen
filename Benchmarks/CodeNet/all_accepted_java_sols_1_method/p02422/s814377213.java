import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=sc.nextInt();
		String string="";
		for(int j=0;j<i;j++) {
			String strs=sc.next();
			int a=sc.nextInt();
			int b=sc.nextInt();
			char [] ch=str.toCharArray();
			if(strs.equals("print")) {
				for(int k=a;k<=b;k++) {
					string=string+ch[k];
				}
				string=string+"\n";
			}
			else if(strs.equals("replace")) {
				String s=sc.next();
				char [] c=s.toCharArray();
				for(int k=0;k<b-a+1;k++) {
					ch[k+a]=c[k];
				}
			}
			else if(strs.equals("reverse")) {
				char [] c=str.toCharArray();
				for(int k=a;k<=b;k++) {
					ch[k]=c[b+a-k];
				}
			}
			str=String.valueOf(ch);
		}
		System.out.print(string);
		sc.close();
		}

	}

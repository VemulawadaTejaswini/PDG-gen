import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string="";
		int o=0;
		for(;;) {
			String str=sc.next();
			if(str.equals("-"))break;
			int i=sc.nextInt();
			int [] a=new int[i];
			for(int j=0;j<i;j++) {
				a[j]=sc.nextInt();
			}
			for(int k=0;k<i;k++) {
				char [] ch=str.toCharArray();
				char [] ch1=new char [a[k]];
				for(int u=0;u<a[k];u++) {
					ch1[u]=ch[u];
					ch[u]='\u0000';
				}
				String str1=String.valueOf(ch);
				String str2=String.valueOf(ch1);
				str=str1.trim()+str2;
			}
			if(o==0) {
				string=string+str;
			}
			else {
				string=string+"\n"+str;
			}
			o++;
		}
		System.out.println(string);
		sc.close();
	}
}

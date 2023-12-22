import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a=new int [26];
		while(sc.hasNextLine()) {
String str=sc.nextLine();
if(str.equals(""))break;
String str1=str.toLowerCase();
char [] ch=str1.toCharArray();
for(int i=0;i<ch.length;i++) {
	for(int j='a';j<='z';j++) {
		if(j==ch[i]) {
			a[j-97]+=1;
		}
	}
}
		}
for(int k='a';k<='z';k++) {
	char c=(char)k;
	System.out.println(c+" : "+a[k-97]);
}
		sc.close();
	}
}

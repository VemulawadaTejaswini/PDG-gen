import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] cnt;
		cnt =new int[30];
		for(int i=0;i<=29;i++)cnt[i]=0;
		while(sc.hasNext()){
			String str=sc.nextLine();
			for(int i=0;i<str.length();i++){
				char s=str.charAt(i);
				if(s>='A' && s<='Z')cnt[(int)(s-'A')]++;
				if(s>='a' && s<='z')cnt[(int)(s-'a')]++;
			}
		}
		for(int i=0;i<26;i++)System.out.printf("%c : %d\n",i+'a',cnt[i]);
	}
};
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int al[] = new int[26];
		for(int i=0;i<26;i++){
			al[i]=0;
		}
		while(sc.hasNext()){
			String line = sc.next();
		line=line.toLowerCase();
		char[] ar = line.toCharArray();
		for(char ch: ar){
			if(Character.isLowerCase(ch)){
				al[ch-97]++;
			}
		}
		}
		for(int i=0;i<26;i++){
			System.out.printf("%c : %d\n",i+97,al[i]);
		}
	}
}
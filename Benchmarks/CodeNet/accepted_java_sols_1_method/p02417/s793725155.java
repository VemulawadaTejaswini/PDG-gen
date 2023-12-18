import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str;
		int[] alpha=new int[26];
		while(sc.hasNext()){
			str=sc.nextLine();
			for(int i=0;i<str.length();i++){
				int ind=Character.getNumericValue(str.charAt(i))-10;
				if(0<=ind&&ind<26){
					alpha[Character.getNumericValue(str.charAt(i))-10]++;
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.println((char)(i+97)+" : "+alpha[i]);
		}
	}
}

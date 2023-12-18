import java.util.*;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int[] counter=new int[26];
	private static ArrayList<String> str=new ArrayList<String>();
	public static void main(String[] args){
		try{
			while(true){
				str.add(sc.next());
			}
		}catch(NoSuchElementException e){}
		for(int i=0;i<str.size();i++){
			getchar(str.get(i));
		}
		show();
	}
	private static void getchar(String s){
		for(int i=0;i<s.length();i++){
			countup(s.charAt(i));
		}
	}
	private static void countup(char c){
		if(Character.isLowerCase(c)){
			int num=c-'a';
			counter[num]++;
		}
		if(Character.isUpperCase(c)){
			char ch=Character.toLowerCase(c);
			int num=ch-'a';
			counter[num]++;
		}
	}
	private static void show(){
		for(int i=0;i<26;i++){
			System.out.println((char)(i+'a')+" : "+counter[i]);
		}
	}
}
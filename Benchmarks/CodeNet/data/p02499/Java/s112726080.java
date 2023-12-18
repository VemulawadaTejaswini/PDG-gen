import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[]a=new int[26];
		while(cin.hasNext()){
			String x;
			x=cin.nextLine();
			for(int i=0;i<x.length();i++){
				char s=x.charAt(i);
				if(65<=s && s<=90){
					a[s-65]=a[s-65]+1;
				}
				if(97<=s && s<=122){
					a[s-97]=a[s-97]+1;
				}
			}
		}
		for(int n=0;n<26;n++){
			int z=(char)(n+97);
			System.out.println((char)z+":"+a[n]);
		}
		System.out.print(" ");
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();
		String s2=scn.next();
		int max=0;
		for(int i=0;i<=s1.length()-s2.length();i++){
			int scnt=0;
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i+j)==s2.charAt(j)){
					scnt++;
				}
			}
			max=Math.max(max, scnt);
		}
		System.out.println(s2.length()-max);
	   

	}

}
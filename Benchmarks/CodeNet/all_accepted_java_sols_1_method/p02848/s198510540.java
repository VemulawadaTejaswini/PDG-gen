import java.util.Scanner;
class Main{
	public static void main(String[] args){
		char[] alfabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int p = 0,Shift;
		String s = scn.next();
		String result = "";
		char tmp[] = new char[10000];
		for(int i=0;i<s.length();i++){
			tmp[i] = s.charAt(i);
			for(int j=0;j<26;j++){
				if(tmp[i]==alfabet[j]){
					p=j;
					break;
				}
			}
			Shift = (p+N)%26;
			tmp[i] = alfabet[Shift];
		}
		for(int i=0;i<s.length();i++){
			result += tmp[i];
		}
		System.out.println(result);
	}
}
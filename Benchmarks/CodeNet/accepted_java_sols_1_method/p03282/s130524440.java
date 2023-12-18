import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		int i = 0;
		char ans = '2';
		while(i < s.length()){
			ans = s.charAt(i);
			if(ans != '1')break;
			i++;
		}
		
		if(k.length()>3||Integer.parseInt(k)>i)System.out.println(ans);
		else System.out.println(1);
	}
}
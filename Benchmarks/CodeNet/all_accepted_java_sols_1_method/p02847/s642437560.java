import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String[] s = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		String input = scn.next();
		int j=0;
		for(int i=0;i<=6;i++){
			if(input.equals(s[i])) j=7-i;
		}
		System.out.println(j);
	}
}
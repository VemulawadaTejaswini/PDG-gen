import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 String s = sc.next();
	 char[] s_i= s.toCharArray();
	int redcounter = 0;
	for(int i = 0; i<s_i.length; i++) {
		if(s_i[i]=='R')redcounter++;
		else redcounter--;
	}
	System.out.println(redcounter>0 ? "Yes":"No");
}

		
	}


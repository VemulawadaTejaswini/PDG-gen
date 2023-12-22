import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		boolean[] a=new boolean[4];
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("N"))a[0]=true;
			if(s.substring(i, i+1).equals("W"))a[1]=true;
			if(s.substring(i, i+1).equals("S"))a[2]=true;
			if(s.substring(i, i+1).equals("E"))a[3]=true;
		}
		if(a[0]==a[2] && a[1]==a[3])System.out.println("Yes");
		else System.out.println("No");
	}
}

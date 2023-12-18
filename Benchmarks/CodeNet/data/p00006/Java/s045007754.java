import java.util.Scanner;

class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int l = str.length();
		char[] out = new char[l];
		for (int i=0 ; i<l ; i++)
			out[i] = str.charAt(i);
		for (int i=l-1 ; i >= 0 ; i--)
			System.out.print(out[i]);
System.out.println();
    }
}
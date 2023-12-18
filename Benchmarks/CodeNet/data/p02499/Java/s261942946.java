import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		while(sc.hasNextLine()){
			String buf = sc.nextLine();
			if(buf.isEmpty())break;
			line+=buf;
		}
		String  s =line.toLowerCase().replaceAll(" ", "").replaceAll(",", "").replaceAll(".", "");
		char c[] = s.toCharArray();
		int a[] =new int[26];
		for (int i = 0; i < c.length; i++) {
			a[(int)c[i]-97]++;
		}
		
		for (int i = 0; i < a.length; i++) {
			char w = (char)(97+i);
			System.out.println(w+" : "+a[i]);
		}
	}
}
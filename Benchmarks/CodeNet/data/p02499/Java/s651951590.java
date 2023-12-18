import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String line=sc.nextLine();
		int a[] =new int[256];
		while(sc.hasNextLine()){
			String buf = sc.nextLine();
			char c[] = buf.toLowerCase().toCharArray();
			for (int i = 0; i < c.length; i++) {
				a[(int)c[i]]++;
			}
		}
		//String  s =line.toLowerCase().replaceAll(" ", "").replaceAll(",", "").replaceAll(".", "");
//		char c[] = s.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			a[(int)c[i]-97]++;
//		}
		
		for (int i = 0; i < a.length; i++) {
			char w = (char)(97+i);
			System.out.println(w+" : "+a[w]);
		}
		sc.close();
	}
}
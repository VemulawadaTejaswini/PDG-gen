import java.util.Scanner;

class Comparer{
	private String A;
	private String B;
	private String small;
	public void set(String a, String b){
		A = a;
		B = b;
	}
	
	public void exe(){
		for (int i = 0; i < ((A.length() > B.length()) ? B.length() : A.length()); i++){
			if (A.charAt(i) > B.charAt(i)){
				small = B;
			}
			else if (A.charAt(i) < B.charAt(i)){
				small = A;
			}
		}
	}
	public String getRes(){
		return small;
	}
}

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int words = sc.nextInt();
		String str[] = new String[words];
		for (int i = 0; i < words; i++){
			str[i] = sc.nextLine();
		}
		String small = new String(str[0]);
		for (int i = 1; i < words; i++){
			Comparer comp = new Comparer();
			comp.set(small, str[i]);
			comp.exe();
			small = comp.getRes();
		}
		System.out.println(small);
	}
}
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		char res=s.charAt(0);
		switch(res){
			case 'A':
				System.out.println("T");
				break;
			case 'T':
				System.out.println("A");
				break;
			case 'C':
				System.out.println("G");
				break;
			case 'G':
				System.out.println("C");
				break;
		}
	}
}

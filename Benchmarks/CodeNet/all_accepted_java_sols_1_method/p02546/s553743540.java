import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		if (s.endsWith("s")){
			s=s.concat("es");
		}
		else{
			s=s.concat("s");
		}
		System.out.println(s);
	}
}
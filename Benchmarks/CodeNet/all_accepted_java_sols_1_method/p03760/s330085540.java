import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String o = scanner.next(),e = scanner.next();
		String s = "";
		if(o.length() == e.length()){
			for(int i=0;i<o.length();i++){
				s += o.charAt(i);
				s += e.charAt(i);
			}
		}else{
			for(int i=0;i<o.length()-1;i++){
				s += o.charAt(i);
				s += e.charAt(i);
			}
			s += o.charAt(o.length()-1);
		}
		System.out.println(s);
	}

}

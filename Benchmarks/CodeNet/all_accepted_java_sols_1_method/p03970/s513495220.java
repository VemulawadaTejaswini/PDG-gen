import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String fes = "CODEFESTIVAL2016";
		
		int num = 0;
		for(int i =0;i<fes.length();i++){
			if(s.charAt(i)!=fes.charAt(i)){
				num++;
			}
		}
		System.out.println(num);
	}
}

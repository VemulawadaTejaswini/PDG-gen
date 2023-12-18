import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int s1 = 0;
		int s2 = 0;
		double avarage = 0;
		String str;
		while((str = sc.nextLine()) != null){
			String[] temp = str.split(",");
			s1 += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
			s2 += Integer.parseInt(temp[1]);
			avarage = (double)s2 / (double)n;
			if(avarage % 1 > 0.4) avarage++;
			n++;
			System.out.println(s1);
			System.out.println((int)avarage);
		}
	}
}
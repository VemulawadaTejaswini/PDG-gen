import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int s1 = 0;
		int s2 = 0;
		float avarage = 0;
		while(sc.hasNext()){
			String[] temp = sc.nextLine().split(",");
			s1 += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
			s2 += Integer.parseInt(temp[1]);
			avarage = s2 / n;
			if(avarage % 1 > 0.4) avarage++;
			n++;
			System.out.println(s1);
			System.out.println((int)avarage);
		}
	}
}
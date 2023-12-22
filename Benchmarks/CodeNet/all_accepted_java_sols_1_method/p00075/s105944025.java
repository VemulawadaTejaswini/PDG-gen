import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double Kg,M;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			Kg = Double.parseDouble(s[1]);
			M = Double.parseDouble(s[2]);
			if(Kg / (M * M) >= 25){
				System.out.println(s[0]);
			}
		}

	}

}
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] a = sc.next().split(",");
			int s = Integer.parseInt(a[0]);
			double w = Double.parseDouble(a[1]);
			double h = Double.parseDouble(a[2]);

			if(w/h/h >= 25){
				System.out.println(s);
			}
		}
	}
}
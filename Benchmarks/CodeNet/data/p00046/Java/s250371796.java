import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = -1;
		double min = 999999999;
		Double hight;
		String h;
		while((h = sc.nextLine()) != null){
			hight = Double.parseDouble(h);
			if(max < hight) max = hight;
			if(min > hight) min = hight;
		}
		System.out.println(max - min);
	}
}
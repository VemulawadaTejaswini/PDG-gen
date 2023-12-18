import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
				int Taro_point = 0;
				int Hanako_point = 0;
		for(int i = 0; i != n; i++)
		{
			String Taro = sc.next();
			String Hanako = sc.next();
				if(Taro.compareTo(Hanako) > 0)
				{
					Taro_point = Taro_point + 3;
				} else if(Taro.compareTo(Hanako) < 0) {
					Hanako_point = Hanako_point + 3;
				} else {
					Taro_point++;
					Hanako_point++;
				}
		}
			System.out.println(Taro_point + " " + Hanako_point);
	}
}
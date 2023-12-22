import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Five_Count = 0;
		int Thousand_Count = 0;
		int num = 0;
		for(int i = 0;i < X;i++) {
			num = X % 500;
			Thousand_Count = X / 500;
			Five_Count = num / 5;
		}
		System.out.println(Thousand_Count * 1000 + Five_Count * 5);
	}
}
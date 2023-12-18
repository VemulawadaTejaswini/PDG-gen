import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String weather[] = {"Sunny","Cloudy","Rainy"};
		int ans = 0;
		for(int i = 0;i < 3;i++) {
			if(s.equals(weather[i])) {
				ans = (i + 1) % 3;
			}
		}
		System.out.println(weather[ans]);
	}

}

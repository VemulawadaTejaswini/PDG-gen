import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = -1;
		switch(s){
		case "MON": x = 6;
		break;
		case "TUE": x = 5;
		break;
		case "WED": x = 4;
		break;
		case "THU": x = 3;
		break;
		case "FRI": x = 2;
		break;
		case "SAT": x = 1;
		break;
		case "SUN": x = 7;
		}
		System.out.println(x);
	}
}
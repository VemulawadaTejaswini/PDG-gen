import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int hour = sec / 3600;
		int min = (sec % 3600) / 60;
		sec = sec % 60;
		
		System.out.println(hour+":"+min+":"+sec);
    }
}


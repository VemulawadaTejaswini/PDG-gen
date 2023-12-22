import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String weather = sc.next();

		int count = 0;
		String sunny = "RSR";

		for(int i=0; i<3; i++){
			if(weather.equals(sunny)){
				count= 1;
				break;
			}else if(weather.charAt(i) == 'R'){
				count++;
			}
		}
		System.out.println(count);
	}
}

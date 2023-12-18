import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int count = 0;
		//String sunny = 'S';

		for(int i=0; i<3; i++){
			String weather = sc.next();
			if(weather.indexOf("S") != 1){
				count++;
			}
		}
		System.out.println(count);
	}
}

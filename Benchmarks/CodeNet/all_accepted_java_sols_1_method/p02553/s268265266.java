import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long [] array = {a*c, a*d, b*c, b*d};
		long intMax = array[0];

        for(int i = 1; i < 4; i++) {
			if(intMax < array[i]) {
				intMax = array[i];
			}
		}
		System.out.println(intMax);
		return;
	}

}

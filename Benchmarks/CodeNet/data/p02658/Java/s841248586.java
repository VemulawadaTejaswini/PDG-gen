import java.util.*;

public class Main {
    public static void main(String[] args) {
		String first = new Scanner(System.in).nextLine();
		int num = Integer.parseInt(first);
		String second = new Scanner(System.in).nextLine();
		String Array[] = second.split(" ");
		long[] number = new long[num];
		for (int u = 0; u < Array.length; u++){
		number[u] = Long.parseLong(Array[u]);
		}
		long kakeru = 1;
		for (int i = 0; i < Array.length; i++){
		if(number[i] >= 2 && number[i] <= 100000L)
		kakeru = kakeru * number[i];
		}
		if (kakeru > 1000000000000000000L){
			kakeru = -1;
		}
		System.out.println(kakeru);
    }
}
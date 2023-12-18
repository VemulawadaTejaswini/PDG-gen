import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> al = new ArrayList<>();

		String in;
		String[] data;
		double tmp;
		for(int i = 0; i < 5; i++) {
			in = sc.next();
			data = in.split(",");
			tmp = Double.parseDouble(data[1]) / Math.pow(Double.parseDouble(data[2]), 2);
			
			if(tmp >= 25)	al.add(data[0]);
		}
		
		for(String i : al)	System.out.println(i);
	}
}
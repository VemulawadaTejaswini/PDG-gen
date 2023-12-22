import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		int i, a = 0, w = 0, t = 0, r = 0;
		Scanner myScanner = new Scanner(System.in);
		List <String> array = new ArrayList<>();
		
		i = myScanner.nextInt();
		while(i >= 0) {
			array.add(myScanner.nextLine());
			i --;
		}
		
		Collections.sort(array);
		
		for(int j = 0; j < array.size(); j ++) {
			if(array.get(j).equals("AC"))
				a ++;
			else if(array.get(j).equals("RE"))
				r ++;
			else if(array.get(j).equals("TLE"))
				t ++;
			else if(array.get(j).equals("WA"))
				w ++;
		}
		System.out.println("AC x " + a);
		System.out.println("WA x " + w);
		System.out.println("TLE x " + t);
		System.out.println("RE x " + r);
		
		myScanner.close();
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String separator = System.getProperty("line.separator");
		sc.useDelimiter(separator);

		read: while (sc.hasNext()){
			String s;
			s = sc.next();
			int sum = 0;
			for(int i = 0; i < s.length(); i++ ){

				char c;
				int j;

				c = s.charAt(i);
				j = Character.getNumericValue(c);
				
				if (i == 0 && j == 0){
					break read;
				}
				
				sum += j;
			}
			System.out.println(sum);
		}
	}
}
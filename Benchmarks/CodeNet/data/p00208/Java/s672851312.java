import java.util.Scanner;
import java.util.regex.Pattern;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Pattern pattern = Pattern.compile(".*4.*|.*6.*");

		while(true){
			long oldNumber = stdIn.nextLong(),newNumber = 0;

			if(oldNumber == 0){
				break;
			}
			int count = 0;
			while(count != oldNumber){
				newNumber++;
				if(pattern.matcher(Long.toString(newNumber)).find()){
					while(pattern.matcher(Long.toString(newNumber)).find()){
						newNumber++;
					}
				}
				count++;
			}
			System.out.println(newNumber);
		}
	}
}
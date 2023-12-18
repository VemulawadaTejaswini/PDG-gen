import java.util.Scanner;
import java.util.regex.Pattern;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^4|^6");
		Pattern pattern2 = Pattern.compile(".*4.*|.*6.*");

		while(true){
			long oldNumber = stdIn.nextLong();
			long newNumber = 0;

			if(oldNumber == 0){break;}

			int count = 0;
			while(count < oldNumber){
				newNumber++;
				String stringNewNumber = Long.toString(newNumber);
				if(pattern.matcher(stringNewNumber).find()){
					newNumber += Math.pow(10, stringNewNumber.length()-1);
				}else if(pattern2.matcher(stringNewNumber).find()){
					while(pattern2.matcher(Long.toString(newNumber)).find()){
						newNumber++;
					}
				}
				count++;
			}
			System.out.println(newNumber);
		}
	}
}
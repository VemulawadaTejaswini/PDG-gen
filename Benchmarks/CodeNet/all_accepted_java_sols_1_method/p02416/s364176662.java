import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		List<Integer> sums = new ArrayList<Integer>();
		for(;;){
			String num = scan.nextLine();
			if(num.equals("0")){
				break;
			}
			int sum = 0;
			for(int i = 0; i < num.length(); i++){
				char n = num.charAt(i);
				sum += Character.getNumericValue(n);
			}
			sums.add(sum);
		}

		for(int m : sums){
			System.out.println(m);
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		int intSum = 0;
		while(true){
			strIn = scan.nextLine();
			if("0".equals(strIn)){
				break;
			}else{
				intSum = 0;
				for(int i = 0; i < strIn.length(); i++){
					intSum += Character.getNumericValue(strIn.charAt(i));
				}
				list.add(intSum);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		scan.close();
	}
}
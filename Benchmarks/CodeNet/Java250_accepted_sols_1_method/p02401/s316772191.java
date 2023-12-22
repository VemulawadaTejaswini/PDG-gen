import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intA;
		String strCulc = "";
		int intB;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			intA = scan.nextInt();
			strCulc = scan.next();
			intB = scan.nextInt();
			if("+".equals(strCulc)){
				list.add(intA + intB);
			}else if("-".equals(strCulc)){
				list.add(intA - intB);
			}else if("*".equals(strCulc)){
				list.add(intA * intB);
			}else if("/".equals(strCulc)){
				list.add(intA / intB);
			}else if("?".equals(strCulc)){
				break;
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		scan.close();
	}
}
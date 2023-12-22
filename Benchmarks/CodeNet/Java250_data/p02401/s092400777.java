import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????


		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		String a = null;
		String b = null;
		String c = null;


		while(scan.hasNext()){

			a = scan.next();
			b = scan.next();
			c = scan.next();

			if(!"?".equals(b)){

				int intA = 0;
				int intC = 0;
				try{
					intA = Integer.parseInt(a);
					intC = Integer.parseInt(c);
				}catch(NumberFormatException e){
					System.out.println(e);
				}

				int intAnser = 0;

				if("+".equals(b)){

					intAnser = intA + intC;
				}else if("-".equals(b)){

					intAnser = intA - intC;
				}else if("*".equals(b)){

					intAnser = intA * intC;
				}else{

					intAnser = intA / intC;
				}


				list.add(intAnser);

			}else{

				scan.close();
				break;
			}

		}

		for(int i = 0; i < list.size(); i++){

			int intResult =list.get(i);
			System.out.println(intResult);
		}


	}
}
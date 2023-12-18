
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] a) {

		Scanner sc = new Scanner(System.in);

		List <String> senro = new ArrayList<String>();



		while(sc.hasNext()) {

			String num = sc.next();

			if(num.equals("0")) {
				int index = senro.size() -1;
				System.out.println(senro.get(index));
				senro.remove(index);

			}else{
				senro.add(num);
			}


		}


	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int data = sc.nextInt();
			int subnumber,tanka,suryou;
			ArrayList<Integer> number = new ArrayList<Integer>();
			ArrayList<Integer> uriage = new ArrayList<Integer>();
			boolean naflag = true;
			if (data == 0) {
				break;
			}
			for (int i = 0; i < data; i++) {
				subnumber = sc.nextInt();
				tanka = sc.nextInt();
				suryou = sc.nextInt();
				if(number.indexOf(subnumber) != -1){
					uriage.set(number.indexOf(subnumber), uriage.get(number.indexOf(subnumber))+(tanka*suryou));
				}else{
					number.add(subnumber);
					uriage.add(tanka*suryou);
				}
			}
			for(int i = 0;i < number.size();i++){
				if(uriage.get(i) >= 1000000){
					System.out.println(number.get(i));
					naflag = false;
				}
			}
			if(naflag){
				System.out.println("NA");
			}
		}
	}
}
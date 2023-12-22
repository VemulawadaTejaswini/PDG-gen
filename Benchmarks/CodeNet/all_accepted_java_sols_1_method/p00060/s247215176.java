
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] line = sc.nextLine().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);
			list.remove(list.indexOf(a));
			list.remove(list.indexOf(b));
			list.remove(list.indexOf(c));
			int count =0;
			for(int i = 0; i < list.size();i++){
				if(a+b+list.get(i) <= 20){
					count++;
				}
			}
			double rate = (double) count/7;
			System.out.println(rate < 0.5 ? "NO":"YES");
		}
	}

}
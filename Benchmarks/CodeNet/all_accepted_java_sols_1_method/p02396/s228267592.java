import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int intTemp;
		while(scan.hasNext()){
			intTemp = scan.nextInt();
			if(intTemp == 0){
				scan.close();
				break;
			}else{
				list.add(intTemp);
			}
		}
		if(list.size() != 0){
			for(int i = 0; i < list.size(); i++){
				System.out.println("Case " + (i + 1) + ": " + list.get(i));
			}
		}
	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> listX = new ArrayList<Integer>();
		ArrayList<Integer> listY = new ArrayList<Integer>();
		int intTempX;
		int intTempY;

		while(scan.hasNext()){
			intTempX = scan.nextInt();
			intTempY = scan.nextInt();
			if(intTempX == 0 && intTempY == 0){
				scan.close();
				break;
			}else if(intTempX < intTempY){
				listX.add(intTempY);
				listY.add(intTempX);
			}else{
				listX.add(intTempX);
				listY.add(intTempY);
			}
		}
		if(listX.size() != 0){
			for(int i = 0; i < listX.size(); i++){
				System.out.println(listY.get(i) + " " + listX.get(i));
			}
		}
	}
}
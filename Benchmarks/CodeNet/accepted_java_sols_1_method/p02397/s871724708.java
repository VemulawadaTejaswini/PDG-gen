import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> listX = new ArrayList<Integer>();
		List<Integer> listY = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int tmpX,tmpY;
		for(;;){
			tmpX = scan.nextInt();
			tmpY = scan.nextInt();
			if((tmpX == 0) && (tmpY == 0)){
				break;
			}
			if(tmpX > tmpY){
				int small = tmpY;
				tmpY = tmpX;
				tmpX = small;
			}
			listX.add(tmpX);
			listY.add(tmpY);
		}

		if(listX.size() != 0){
			for(int i = 0; i < listX.size(); i++){
				System.out.printf("%d %d\n", listX.get(i), listY.get(i));
			}
		}
	}
}
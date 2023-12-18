import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		List list = new ArrayList();
		int intSub = -1;
		boolean isZero = false;
		while(isZero){
			Scanner scan = new Scanner(System.in);
			intSub = scan.nextInt();
			if(intSub == 0){
				isZero = true;;
			}else{
				list.add(intSub);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}

	}
}
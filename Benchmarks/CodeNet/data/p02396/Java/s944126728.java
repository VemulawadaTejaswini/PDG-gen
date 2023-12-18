import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		List list = new ArrayList();
		int intSub = -1;
		Scanner scan = new Scanner(System.in);
		while(true){
				intSub = scan.nextInt();
				list.add(intSub);
				if(intSub == 0){
					scan.close();
					break;
				}
		}
		scan.close();
		for(int i = 0; i < list.size() - 1; i++){
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}
	}
}
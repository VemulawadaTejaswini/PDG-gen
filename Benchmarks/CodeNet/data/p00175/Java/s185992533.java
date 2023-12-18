
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == -1){
				break;
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(n & 3);
			n = n >> 2;
			while(n > 0){
				list.add(n & 3);
				n = n >> 2;
			}
			//oÍ
			for(int i=list.size()-1; i >= 0; i--){
				System.out.print(list.get(i));
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}
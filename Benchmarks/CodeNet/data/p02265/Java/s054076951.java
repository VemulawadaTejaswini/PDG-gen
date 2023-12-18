import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = 0;
		String meirei;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i;
		int size;
		
		for(i = 0; i < n; i++){
			 meirei = scan.next();
			 size = list.size();
			 
			if(meirei.charAt(6) == 'F'){
					list.remove(size - 1);
			}else if(meirei.charAt(6) == 'L'){
					list.remove(0);
			}else if(meirei.charAt(0) == 'i' ||meirei.charAt(0) == 'd'){
				m = scan.nextInt();
				if(meirei.charAt(0) == 'i'){
					list.add(m);
			}else{
					for(int j = size - 1; j >= 0; j--){
						if(m == list.get(j)){
							list.remove(j);
							break;
						}
					}
				}
			}
		}
		
		size = list.size();
		
		for(i = size - 1; i >= 0; i--){
			if(i != 0){
				System.out.print(list.get(i) + " ");
			}else{
				System.out.println(list.get(i));
			}
		}
	}
}
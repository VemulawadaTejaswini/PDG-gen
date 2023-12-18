import java.util.Scanner;
import java.util.ArrayList;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < n; i++){
			String meirei = scan.next();
			int m = scan.nextInt();

			if(meirei.equals("insert")){
				list.add(m);
			}else if(meirei.equals("delete")){
				for(int j = list.size() - 1; j >= 0; j--){
					if(m == list.get(j)){
						list.remove(j);
						break;
					}
				}
			}else if(meirei.equals("deleteFirst")){
				list.remove(list.size() - 1);
			}else if(meirei.equals("deleteLast")){
				list.remove(0);
			}
		}
		
		for(int i = list.size() - 1; i >= 0; i--){
			if(i != 0){
				System.out.print(list.get(i) + " ");
			}else{
				System.out.println(list.get(i));
			}
		}
	}
	
}
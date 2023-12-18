import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		String sta;  /*Statement*/
		int num = 0;
		int cnt = 0;

		
		for(int i=0; i<N; i++){
			sta = sc.next();
			
			if(sta.equals("insert")){
				num = sc.nextInt();
				list.add(num);
			}else if(sta.equals("delete")){
				num = sc.nextInt();
				list.remove(list.indexOf(num));
			}else if(sta.equals("deleteFirst")){
				list.remove(list.size()-1);
			}else if(sta.equals("deleteLast")){
				list.remove(0);
			}
		}
		for (int i=list.size()-1; i>0; i--){
	        System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(0));
	}
}


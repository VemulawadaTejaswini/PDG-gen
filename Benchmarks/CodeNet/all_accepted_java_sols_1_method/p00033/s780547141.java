import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(10);
		List<Integer> sub_list = new ArrayList<Integer>(10);
		
		for(int i = 0;i<n;i++){
			list.clear();
			sub_list.clear();
			
			for(int j=0;j < 10;j++){
				list.add(sc.nextInt());
			}
			
			
			for(Iterator<Integer> ite = list.iterator(); ite.hasNext();){
				int tmp = ite.next();
				if(sub_list.isEmpty()){
					sub_list.add(tmp);
					ite.remove();
				}else{
					if(sub_list.get(sub_list.size()-1) < tmp){
						sub_list.add(tmp);
						ite.remove();
					}
				}
			}
			
			boolean check = true;
			int pre_num = 0;
			for(Iterator<Integer> ite = list.iterator(); ite.hasNext();){
				int tmp = ite.next();
				if(pre_num >= tmp){
					check = false;
					break;
				}else{
					pre_num = tmp;
				}
			}
			
			System.out.println("" + (check ? "YES" : "NO"));
			
		}
	}
}
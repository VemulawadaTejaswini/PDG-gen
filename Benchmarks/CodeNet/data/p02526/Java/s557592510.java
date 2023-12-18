import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n =  scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++){
				list.add(scan.nextInt());
			}
			Collections.sort(list);
			int m = scan.nextInt();
			int counter = 0;
			List<Integer> list2 = new ArrayList<Integer>();
			for(int i = 0; i < m; i++){
				list2.add(scan.nextInt());
			}
			Collections.sort(list2);
			int a,b ;
			Iterator<Integer> it = list.iterator();
			Iterator<Integer> it2 = list2.iterator();
			a = it.next();
			b = it2.next();
			while(it2.hasNext() || it.hasNext()){
				if( a == b){
					counter++;
					a =it.next();
					b =it2.next();
				}else if( a < b){
					a = it.next();
				}else if(a > b){
					b = it2.next();
				}
			}
			System.out.println(counter);
		}finally{
			scan.close();
		}
	}
}
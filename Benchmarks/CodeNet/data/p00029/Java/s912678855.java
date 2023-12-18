import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			List<String> list = new ArrayList<String>();
			List<Integer> count = new ArrayList<Integer>();
			int max_length = 0;
			String max ="";
			while(scan.hasNext()){
				String str = scan.next();
				int i;
				if((i =list.indexOf(str)) != -1){
					count.set(i, count.get(i) + 1);
				}else{
					list.add(str);
					count.add(1);
					if(str.length() >max_length){
						max = str;
					}
				}
			}
			Iterator<Integer> it = count.iterator();
			int size = 0, max_size = 0;
			for(int i = 0 ; it.hasNext();i++)
				if(it.next() >max_size)
				size = i;
			System.out.print(list.get(size)+" ");
			System.out.println(max);
			list.clear();
			count.clear();
		}finally{
			if(scan !=null)scan.close();
		}
	}
}
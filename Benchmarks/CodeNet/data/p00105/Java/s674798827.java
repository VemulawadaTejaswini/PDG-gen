//Volume1-0105
import java.util.*;

class Index implements Comparable<Index>{
	
	public final String ward;
	public ArrayList<Integer> page;

	public  Index(String s,int i){
		this.ward = s;
		this.page = new ArrayList<Integer>();
		this.page.add(i);
	}
	
	public int compareTo(Index I){
		return this.ward.compareTo(I.ward);
	}
}

public class Main {

	public static void main(String[] args) {

		//declare
		ArrayList<Index>   list = new ArrayList<Index>(); 
		ArrayList<Integer> p;
		String[]           s;
		String             ward;
		int                page,
                           size;
		boolean            find;
		
		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = sc.nextLine().split("\\s");
			ward = s[0];
			page = Integer.parseInt(s[1]);

			//calculate
			find = false;
			for(Index I:list){
				if(I.ward.equals(ward)){
					I.page.add(page);
					find = true;
					break;
				}
			}
			if(!find){list.add(new Index(ward,page));}
		}
		Collections.sort(list);
		for(Index i:list){Collections.sort(i.page);}
		
		//output
		for(Index I:list){
			System.out.println(I.ward);
			p = I.page;
			size = p.size();
			for(int i=0;i<size;i++){
				System.out.print(p.get(i));
				if(i<size-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
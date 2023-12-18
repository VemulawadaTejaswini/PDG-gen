import java.util.*;

class Cnt {
	public int number,
	           count = 1;
	Cnt(int a){this.number = a;}
}

public class Main {
	
	private static ArrayList<Cnt> list = new ArrayList<Cnt>();
	
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		
		Cnt cnt;
		boolean find_flg;	
		while(sc.hasNext()){
			cnt = new Cnt(sc.nextInt());

			find_flg = false;
			for(Cnt c:list){
				if(c.number == cnt.number){
					c.count++;
					find_flg = true;
					break;
				}
			}
			if(!find_flg){list.add(cnt);}
		}

		//calculate frequency of appearance.
		int freq_max = 0;
		ArrayList<Integer> freq_number = new ArrayList<Integer>();
		for(Cnt c:list){
			if(c.count == freq_max){
				freq_number.add(c.number);
			}
			if(c.count > freq_max){
				freq_max = c.count;
				freq_number.clear();
				freq_number.add(c.number);
			}
		}

		//output
		for(int num:freq_number){System.out.println(num);}
	}
}
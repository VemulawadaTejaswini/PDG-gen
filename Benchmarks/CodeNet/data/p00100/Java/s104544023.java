import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			Map<Integer, Salesman> map = new HashMap<Integer, Salesman>();
			int n = sc.nextInt(); if(n == 0) break;
			
			int id = 0;
			int unitprice = 0;
			int unit = 0;
			int in_no = 0;
			for(int i = 0; i < n; i++){
				id = sc.nextInt();
				unitprice = sc.nextInt();
				unit = sc.nextInt();
				if(map.containsKey(id)){
					Salesman s = map.get(id);
					s.addSales(unitprice * unit);
				} else{
					Salesman s = new Salesman(id, in_no++);
					s.addSales(unitprice * unit);
					map.put(id, s);
				}
			}
			List<Salesman> result = new ArrayList<Salesman>();
			for(Entry<Integer, Salesman> e: map.entrySet()){
				Salesman s = e.getValue();
				if(s.salesMoreThan(1000000)) result.add(s);
			}
			Collections.<Salesman> sort(result, new Comparator<Salesman>(){
				
				@Override
				public int compare(Salesman o1, Salesman o2){
					if(o1.getInNo() < o2.getInNo())
						return -1;
					else if(o1.getInNo() == o2.getInNo())
						return 0;
					else
						return 1;
				}
			});
			if(result.size() != 0) for(Salesman s: result) System.out.println(s.getID());
			else System.out.println("NA");
		}
		sc.close();
	}
	
}

class Salesman{
	private int in_no;
	private int ID;
	private long sales;
	
	public Salesman(int ID, int in_no) {
		this.ID = ID;
		this.in_no = in_no;
	}
	
	public int getID() { return this.ID;}
	
	public int getInNo() { return this.in_no;}
	
	public boolean salesMoreThan(int sales) {
		return this.sales >= sales;
	}
	
	public void addSales(int sales) {
		this.sales += sales;
	}
}
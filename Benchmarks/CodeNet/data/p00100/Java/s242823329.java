import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Data> list;
		while(true) {
			list = new ArrayList<Data>(5000);
			for(int i = 0; i < 5000; i++) {
				list.add(new Data(i+1,0,-1));
			}
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int count = 0;
			for(int i = 0; i < n; i++) {
				int id = stdIn.nextInt();
				int v = stdIn.nextInt();
				int s = stdIn.nextInt();
				if(list.get(id).number == -1) {
					list.set(id,new Data(id,v*s,count++));
				}
				else {
					Data k = list.get(id);
					k.addValue(v*s);
					list.set(id, k);
				}
			}
			Collections.sort(list,new MyComparator1());
			for(int i = 0; i < list.size(); i++) {
				Data tmp = list.get(i);
				if(tmp.value < 1000000) {
					list.remove(i);
					i--;
					continue;
				}
			}
			Collections.sort(list, new MyComparator2());
			if(list.isEmpty()) {
				System.out.println("NA");
			}
			for(int i = 0; i < list.size(); i++) {
				Data tmp = list.get(i);
				System.out.println(tmp.id);
			}
		}
	}
	
}

class Data {
	public int id;
	public int value;
	public int number;
	Data(int i, int v, int n) {
		id = i;
		value = v;
		number = n;
	}
	public void addValue(int v) {
		value += v;
	}

	
}

class MyComparator1 implements Comparator<Data> {

	public int compare(Data o1, Data o2) {
		if(o1.value < o2.value) {
			return 1;
		}
		else if(o1.value > o2.value) {
			return -1;
		}
		
		return 0;
	}
	
}

class MyComparator2 implements Comparator<Data> {

	public int compare(Data o1, Data o2) {
		if(o1.number < o2.number) {
			return -1;
		}
		else if(o1.number > o2.number) {
			return 1;
		}
		return 0;
	}
	
}
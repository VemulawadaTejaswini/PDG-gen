import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			ArrayList<Data> list = new ArrayList<Data>();
			int n = stdIn.nextInt();
			int l = stdIn.nextInt();
			if(n == 0 && l == 0) break;
			for(int i = 0; i < n; i++) {
				String a = stdIn.next();
				int b = stdIn.nextInt();
				if(a.equals("R")) {
					list.add(new Data(true,b,i+1));
				}
				else {
					list.add(new Data(false,b,i+1));
				}
			}
			int t = 0;
			MyComp comp = new MyComp();
			int lastremid = 0;
			while(true) {
				if(list.size() == 0) break;
				Collections.sort(list,comp);
				int lastp = -1;
				boolean isLR = false;
				for(int i = 0; i < list.size(); i++) {
					Data tmp = list.get(i);
					if(tmp.p == l) {
						if(!isLR) {
							lastremid = tmp.id;
						}
						list.remove(i);
						i--;
						continue;
					}
					if(tmp.p == 0) {
							lastremid = tmp.id;
							list.remove(i);
							i--;
							isLR = true;
							continue;
					}
					if(tmp.p == lastp) {
						if(tmp.isR) {
							tmp.isR = false;
						}
						else {
							tmp.isR = true;
						}
						list.set(i, tmp);
						tmp = list.get(i-1);
						if(tmp.isR) {
							tmp.isR = false;
						}
						else {
							tmp.isR = true;
						}
						list.set(i-1, tmp);
					}
					lastp = tmp.p;
				}
				for(int i = 0; i < list.size(); i++) {
					Data tmp = list.get(i);
					if(tmp.isR) {
						tmp.p++;
					}
					else {
						tmp.p--;
					}
					list.set(i, tmp);
				}
				t++;
			}
			System.out.println(t-1 +" " + lastremid);
		}
	}
}
class Data {
	boolean isR;
	int p;
	int id;
	Data(boolean a, int b,int c) {
		isR = a;
		p = b;
		id = c;
	}
}

class MyComp implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.p < o2.p) {
			return -1;
		}
		if(o1.p > o2.p) {
			return 1;
		}
		return 0;
	}
	
}
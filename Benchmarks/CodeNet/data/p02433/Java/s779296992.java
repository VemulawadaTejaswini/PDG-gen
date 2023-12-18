import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		List <Long> list = new LinkedList<Long>();
		ListIterator<Long> listIter = list.listIterator();
		try (Scanner sc = new Scanner (System.in)){
			int times = sc.nextInt();
			long x,d;
			for (int i=0; i < times; i++) {
				int query = sc.nextInt();
				switch (query) {
				//insert(x)
				case 0:
					x = sc.nextLong();
					listIter.add(x);
					listIter.previous();
					break;
				//move(d)
				case 1:
					d = sc.nextLong();
					if (d > 0) {
						for (int j=0; j<d; j++) {
							listIter.next();   //後ろに移動
						}
					} else if (d < 0){
						long a = -d;  //絶対値にする
						for (int j=0; j<a; j++) {
							listIter.previous();   //前に移動
						}
					}
					break;
				//erase()
				case 2:
					listIter.next();  //最後にnext()またはprevious()で返された要素が削除されるため、先に後ろにずらす
					listIter.remove();
					break;
				}
			}
			ListIterator<Long> ite = list.listIterator();			
			while (ite.hasNext()) {
				System.out.println(ite.next());  //最後まで出力する
			}
		}
	}
}

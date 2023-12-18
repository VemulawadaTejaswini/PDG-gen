import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int q = Integer.parseInt(br.readLine());

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();


		MyDeque deque = new MyDeque(400000);
		boolean changed = false;
		Integer a[] = null;
		for(int i = 0; i < q; i++){
			String[] tmpArray = br.readLine().split(" ");

			if(tmpArray[0].equals("0")){
				if(tmpArray[1].equals("0")){
					deque.push(Integer.parseInt(tmpArray[2]));

				}
				else{
					deque.add(Integer.parseInt(tmpArray[2]));
				}
//				changed = true;
			}
			else if(tmpArray[0].equals("1")){
//				if(changed){
//					a = deque.toArray(new Integer[0]);
//				}
//				System.out.println(a[Integer.parseInt(tmpArray[1])]);
				System.out.println(deque.get(Integer.parseInt(tmpArray[1])));
//				changed = false;
			}
			else {
//				list.removeLast();
				if(tmpArray[1].equals("0")){
					deque.removeFirst();
				}
				else {
					deque.removeLast();
				}
				changed = true;
			}

//			for(int j = 0; j < list.size(); j++){
//				System.out.print(list.get(j)+" ");
//			}
//			System.out.println();
		}
    }
}

class MyDeque {
	private int limit;
	private int first, last;
	private int[] data;
	MyDeque(int limit){
		data = new int [limit * 2 + 1];
		first = limit;
		last = limit;
	}

	void push(int x){
		data[--first] = x;
	}

	void add(int x){
		data[last++] = x;
	}

	int get(int index){
		return data[first + index];
	}

	int removeFirst(){
		int result = data[first++];
		return result;
	}

	int removeLast(){
		last--;

		return data[last];
	}
}


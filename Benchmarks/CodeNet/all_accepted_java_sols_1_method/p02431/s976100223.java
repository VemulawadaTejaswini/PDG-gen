import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int q = Integer.parseInt(br.readLine());

//		LinkedList<Integer> list = new LinkedList<Integer>();
		Vector<Integer> list = new Vector<Integer>();
		for(int i = 0; i < q; i++){
			String[] tmpArray = br.readLine().split(" ");

			if(tmpArray[0].equals("0")){
				list.add(Integer.parseInt(tmpArray[1]));
			}
			else if(tmpArray[0].equals("1")){
				System.out.println(list.get(Integer.parseInt(tmpArray[1])));
			}
			else {
//				list.removeLast();
				list.remove(list.size() - 1);
			}
		}
    }
}


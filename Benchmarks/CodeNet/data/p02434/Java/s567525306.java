import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		@SuppressWarnings("unchecked")
		Vector<Integer>[] vecArray = new Vector[n];
		for(int i = 0; i < n; i++){
			vecArray[i] = new Vector<Integer>();
		}

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			//pushBack
			if(tmpArray[0].equals("0")){
				int t = Integer.parseInt(tmpArray[1]);
				int x = Integer.parseInt(tmpArray[2]);

				vecArray[t].add(x);
//				printVec(vecArray[t]);
			}
			//dump
			else if(tmpArray[0].equals("1")){
				int t = Integer.parseInt(tmpArray[1]);

				printVec(vecArray[t]);
			}
			//clear
			else {
				int t = Integer.parseInt(tmpArray[1]);

				vecArray[t] = new Vector<Integer>();
				
//				System.out.println("removed : "+t);
			}
		}

	}
	
	static void printVec(Vector vec){
		Iterator it = vec.iterator();

		StringBuffer sb = new StringBuffer();
		while(it.hasNext()){
			sb.append(it.next());

			if(it.hasNext()){
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}

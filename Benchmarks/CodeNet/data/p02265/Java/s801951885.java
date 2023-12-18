import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			String[] strArray = br.readLine().split(" ");
			String inst = strArray[0];

			if(inst.equals("insert")){
				list.addFirst(Integer.parseInt(strArray[1]));
			}
			else if(inst.equals("delete")){
				list.removeFirstOccurrence(Integer.parseInt(strArray[1]));
			}
			else if(inst.equals("deleteFirst")){
				list.remove();
			}
			else if(inst.equals("deleteLast")){
				list.removeLast();
			}
			//System.out.println("i = " + i);
			//printList(list);
		}

		printList(list);
	}

	static void printList(LinkedList list){
		for(int i = 0; i < list.size() ; i++){
			System.out.print(list.get(i));
			if(i != list.size() - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
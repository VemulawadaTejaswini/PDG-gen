import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		final LinkedList<String> list = new LinkedList<String>();
		runProcessing(list);
		printList(list);
	}
	
	public static void printList(LinkedList<String> list) {
		final StringBuilder result = new StringBuilder();
		final String lb = System.getProperty("line.separator");
		final int size = list.size()-1;
		
		int i = 0;
		for (String key : list) {
			result.append(key).append(i < size ? " " : lb);
			i++;
		}
		System.out.print(result.toString());
	}

	public static void runProcessing(final LinkedList<String> list) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < n; i++) {
			final String[] command = reader.readLine().split(" ");
			
			if ("insert".equals(command[0])) {
				list.addFirst(command[1]);
				
			} else if ("delete".equals(command[0])) {
				list.remove(command[1]);
				
			} else if ("deleteFirst".equals(command[0])) {
				list.removeFirst();
				
			} else if ("deleteLast".equals(command[0])) {
				list.removeLast();
			}
			if ((i % 1000000) == 0) System.gc();
		}
	}
}
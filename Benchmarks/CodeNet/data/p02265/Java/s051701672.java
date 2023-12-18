import java.io.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine());
	ArrayList<Integer> list = new ArrayList<Integer>();
	String input;
	for (int i = 0; i < n; i++) {
	    input  = reader.readLine();
	    if (input.equals("deleteFirst")) {
		list.remove(0);
	    } else if (input.equals("deleteLast")) {
		list.remove(list.size() - 1);
	    } else {
		if (input.startsWith("insert")) {
		    list.add(0, Integer.parseInt(input.substring(7)));
		} else if (input.startsWith("delete")) {
		    int index = list.indexOf(Integer.parseInt(input.substring(7)));
		    if(index != -1) {
			list.remove(index);
		    }
		}
	    }
	}
	for (int i = 0; i < list.size() - 1; i++) {
	    System.out.print(list.get(i) + " ");
	}
	System.out.println(list.get(list.size() - 1));
    }
}
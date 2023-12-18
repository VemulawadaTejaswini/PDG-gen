import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> list = new ArrayList<Integer>();
	String[] command;
	int max, maxId;
	while (true) {
	    command = br.readLine().split(" ");
	    if (command[0].equals("end")) {
		break;
	    } else if (command[0].equals("insert")) {
		list.add(Integer.parseInt(command[1]));
	    } else if (command[0].equals("extract")) {
		maxId = 0;
		max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
		    if (max < list.get(i)) {
			max = list.get(i);
			maxId = i;
		    }
		}
		System.out.println(list.remove(maxId));
	    }
	}
    }
}
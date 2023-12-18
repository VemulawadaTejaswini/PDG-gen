import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> list = new ArrayList<Integer>();
	String[] command;
	int max;
	while (true) {
	    command = br.readLine().split(" ");
	    if (command[0].equals("end")) {
		break;
	    } else if (command[0].equals("insert")) {
		int i = 0;
		int element = Integer.parseInt(command[1]);
		if (list.size() == 0) {
		    list.add(0, element);
		    continue;
		}
		while (i < list.size() && list.get(i) > element) {
		    i++;
		}
		list.add(i, element);
	    } else if (command[0].equals("extract")) {
		System.out.println(list.remove(0));
	    }
	}
    }
}
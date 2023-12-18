import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	TreeMap<String, List<Integer>> index = new TreeMap<>();
	// ??\?????????????´??????¨????????¨????????¨?????????
	while (sc.hasNextLine()) {
	    String[] input = sc.nextLine().split(" ");
	    if ("".equals(input[0])) {
		break;
	    }
	    String name = input[0];
	    Integer page = Integer.parseInt(input[1]);

	    if ("".equals(name)) {
		break;
	    }

	    if (index.containsKey(name)) {
		index.get(name).add(page);
	    } else {
		List<Integer> newInt = new ArrayList<>();
		newInt.add(page);
		index.put(name, newInt);
	    }

	}

	// ????????????????????????????????¨??????
	for (String name : index.keySet()) {
	    Collections.sort(index.get(name));
	    System.out.println(name);
	    StringBuilder sb = new StringBuilder();

	    for (Integer page : index.get(name)) {
		sb.append(page.toString());
		sb.append(" ");
	    }
	    System.out.println(sb.deleteCharAt(sb.length() - 1));
	}

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine().split(" ")[0]);
    	List<String> list = new ArrayList<>();
    	for(int i =0; i < n; i++) {
    		list.add(br.readLine());
    	}

    	Collections.sort(list);
    	list.forEach(System.out::print);

    }
}

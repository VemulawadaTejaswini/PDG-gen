import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class Main {
	    public static void main(String[] args) throws Exception {
	        // Here your code !
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        String line2 = br.readLine();
	        String[] ary = line2.split(" ");
	        long sum = 0;
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i < ary.length;i++) {
	            list.add(new Integer(ary[i]));
	        }
	        Collections.sort(list);
	        for(Integer item : list) {
	            sum += item;
	        }
	        System.out.println(list.get(0) + " " + list.get(list.size() - 1) + " " + sum);
	    }
	}
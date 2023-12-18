import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        while(true) {
	        String line = br.readLine();
	        String[] ary = line.split(" ");
	        if(new Integer(ary[0]).equals(0) && new Integer(ary[1]).equals(0) ) 
	        	break;
	        if(new Integer(ary[0]) >= new Integer(ary[1])) {
		        list.add(ary[1]);
		        list.add(" ");
		        list.add(ary[0]);
	        }else {
		        list.add(ary[0]);
		        list.add(" ");
		        list.add(ary[1]);
	        }
	        list.add("\n");
        }
        for(String s: list) {
	        System.out.print(s);
        }
    }
}
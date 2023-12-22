
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class Main{

	public static void main(String[] args){


		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine();

		Map<Integer, Integer> map = new LinkedHashMap<>(N);

        for(int i=0; i<N; i++) {

	   		int t = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int point = x+y;

			map.put(t,point);

	       }

    	int flagk =0;
    	int flagv =0;

    	int count =0;


	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

	       // System.out.println(entry.getKey() + " : " + entry.getValue());
	    	int key = entry.getKey().intValue();
	    	int val = entry.getValue().intValue();

	    	//System.out.println("process: key" + key + "val" + val);


	    	if ( (key>=val) && (key%2==val%2) && ( Math.abs(key-flagk) >=Math.abs(val-flagv) ) ) {
	    		flagk = key;
	    		flagv = val;
	    	}
	    	else {
	    		System.out.println("No");
	    		//System.out.println("key" + (key-flagk) + "val" + Math.abs(val-flagv));
	    		//System.out.println("key" + key + "val" + val);
	    		break;
	    	}

	    	++count;
	    	if (count ==N) {
	    		System.out.println("Yes");
	    	}

	    }

	}
}


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {
	static Scanner InData = new Scanner(System.in);
	static int qType, qVal;
	static String qKey, qLeft, qRight;
	static TreeMap<String, Integer> M = new TreeMap<String, Integer>();
	public static void main(String[] args) {
		getQuery();
	}
	private static void getQuery() {
		int qNum = InData.nextInt();
		for(int indexOfQuery = 0; indexOfQuery < qNum; indexOfQuery++) {
			qType = InData.nextInt();
			qKey = InData.next();
			doQuery(qType, qKey);
		}
	}
	private static void doQuery(int type, String key) {
		switch(type) {
		case 0:
			qVal = InData.nextInt();
				M.put(key, qVal);
			break;
		case 1:
			if(M.containsKey(key)) 
				System.out.println(M.get(key));
			else
				System.out.println(0);
			break;
		case 2:
			M.remove(key);
			break;
		case 3:
			qLeft = key;
			qRight = InData.next();
			Iterator<String> it = M.subMap(qLeft, qRight + 1).keySet().iterator();
			String outKey;
			while(it.hasNext()) {
				outKey = it.next();
				System.out.println(outKey + " " + M.get(outKey));
			}
			break;
		}
	}
}

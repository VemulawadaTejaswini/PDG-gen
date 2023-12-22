import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	static TreeMap<Integer,String> data = new TreeMap<Integer,String>();
	static Map<Integer,Integer> dataOrder = new TreeMap<Integer,Integer>();
	static Map<String,Integer> numMap = new HashMap<String,Integer>();
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int cityNum = Integer.valueOf(line.split(" ")[1]);
		for(int i=0;i<cityNum;i++) {
			String tempLine = br.readLine();
			String xiaquTemp = tempLine.split(" ")[0];
			int cityTemp = Integer.valueOf(tempLine.split(" ")[1]);
			data.put(cityTemp, xiaquTemp);
			dataOrder.put(i, cityTemp);
		}
		Iterator<Integer> it=data.keySet().iterator();
		String baseStr = "000000";
		while(it.hasNext()) {
			int key = it.next();
        	String pre = data.get(key);
        	int intback = 0;
        	if(numMap.containsKey(pre)) {
        		intback = numMap.get(pre)+1;
        	}else {
        		intback = 1;
        	}
        	String back = String.valueOf(intback);
        	String str1 = baseStr.substring(0, baseStr.length()-pre.length())+pre;
        	String str2 = baseStr.substring(0, baseStr.length()-back.length())+back;
        	numMap.put(pre, intback);
        	data.put(key, str1+str2);
		}
		Iterator<Integer> it1=dataOrder.keySet().iterator();
		while(it1.hasNext()) {
			int a = it1.next();
			int b = dataOrder.get(a);
			System.out.println(data.get(b));
		}
	}
}
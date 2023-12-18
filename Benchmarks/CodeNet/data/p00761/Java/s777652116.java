import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int num = Integer.parseInt(tmpArray[0]);
			int len = Integer.parseInt(tmpArray[1]);
			
			
			if(num == 0 && len == 0){
				break;
			}
			
//			System.out.println("max "+maxDecimal(num, len));
//			System.out.println("min "+minDecimal(num, len));
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(num, 0);
			int i = 1;
			while(true){
				int maxnum = maxDecimal(num, len);
				int minnum = minDecimal(num, len);
//				
//				System.out.println("max "+maxDecimal(num, len));
//				System.out.println("min "+minDecimal(num, len));
				
				num = maxnum - minnum;
				if(map.containsKey(num)){
					System.out.println(map.get(num)+" "+ num+" "+( i - map.get(num)));
					break;
				}
				else {
					map.put(num, i);
				}
				i++;
			}
		}
	}
	
	static int maxDecimal(int num, int len){
		String tmpStr = Integer.toString(num);
		char[] carray = tmpStr.toCharArray();
		Arrays.sort(carray);
		StringBuffer sb = new StringBuffer(new String(carray));
		
		int tmpResult = Integer.parseInt(sb.reverse().toString());
		
		if(sb.length() < len){
			tmpResult *= Math.pow(10, len - sb.length());
		}
		
		return tmpResult;
	}
	
	static int minDecimal(int num, int len){
		String tmpStr = Integer.toString(num);
		char[] carray = tmpStr.toCharArray();
		Arrays.sort(carray);
		StringBuffer sb = new StringBuffer(new String(carray));
		
		int tmpResult = Integer.parseInt(sb.toString());
			
		return tmpResult;
	}

}
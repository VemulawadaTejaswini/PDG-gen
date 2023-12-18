

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		int count=1;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int tmpp = Integer.MAX_VALUE;
		
		ArrayList<Integer> ast1 = new ArrayList<Integer>();
		ArrayList<String> ast = new ArrayList<String>();
		
		
		String[] sprite;
		
		
		double tmp1,tmp2;
		int[] kazutmp = new int[9];
		int[] kazu = new int[4];
		int[] kazu2 = new int[9];
		boolean flag;
		
		
		int tmper;
		
		boolean flagr = false;
		
		String kaibun;
		
		while(true){
			
			try {
				tmp = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			if(tmp == null){
				break;
			}
			if(tmp.equals("")){
				break;
			}
			
			kaibun = getName(tmp);
			if(tmp.equals(kaibun)){
				count++;
				
			}
			
		}
		System.out.println(count);
		
	}public static String getName(String name) {
	    StringBuffer sb = new StringBuffer(name);
	    name = sb.reverse().toString();
	    return name;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while((s=br.readLine())!=null){
			int max=0;
			String maxString="";
			Map<String, Integer> val=new HashMap<String, Integer>();
			Map<Integer, String> key=new HashMap<Integer, String>();
			Set<String> set=new HashSet<String>();
			StringTokenizer st=new StringTokenizer(s," ");
			ArrayList<String> list=new ArrayList<String>();
			while(st.hasMoreTokens()){
				String ss=st.nextToken();
				list.add(ss);
				set.add(ss);
			}
			int i=0;
			for (String string : set) {
				val.put(string, i);
				key.put(i, string);
				int l=string.length();
				if(max<l){
					max=l;
					maxString=string;
				}
				i++;
			}
			
			int[] a=new int[set.size()];
			
			for (int j = 0; j < list.size(); j++) {
				a[val.get(list.get(j))]++;
			}
			int maxFreq=0;
			String maxFreqString="";
			for (int j = 0; j < a.length; j++) {
				if(a[j]>maxFreq){
					maxFreq=a[j];
					maxFreqString=key.get(j);
				}
			}
			
			System.out.print(maxFreqString+" "+maxString);
			
		}
	}

}
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				/* input */
				String line = br.readLine();
				if(line.equals("0")) break;


				int n = Integer.parseInt(line);
				
				HashMap<Integer,ArrayList<String>> h = new HashMap<Integer,ArrayList<String>>();
				HashMap<String,Integer> score = new HashMap<String,Integer>();
				
				for(int i=1;i<=n;i++){
					line = br.readLine();
					String[] str = line.split(" ");
					String name = str[0];
					int m = Integer.parseInt(str[1]);
					for(int j=0;j<m;j++){
						int d = Integer.parseInt(str[2+j]);
						if(h.containsKey(d)){
							ArrayList<String> t = h.get(d);
							t.add(name);
							h.put(d,t);
						} else {
							ArrayList<String> t = new ArrayList<String>();
							t.add(name);
							h.put(d, t);
						}
					}
				}
				
				for(Integer i : h.keySet()){
					int num = h.get(i).size();
					for(String name : h.get(i)){
						if(score.containsKey(name)){
							int t = score.get(name);
							t += n-num+1;
							score.put(name,t);
						} else {
							score.put(name, n-num+1);
						}
					}
				}
				
				ArrayList entries = new ArrayList(score.entrySet());
				Collections.sort(entries,new Comparator(){
				 public int compare(Object o1, Object o2){
				  Map.Entry<String,Integer> e1 =(Map.Entry)o1;
				  Map.Entry<String,Integer> e2 =(Map.Entry)o2;
				  return e1.getValue() - e2.getValue();
				 }
				});

				String[] str = entries.get(0).toString().split("=");
				System.out.println(str[1] + " " + str[0]);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    HashMap<String,ArrayList<Integer>> ansMap = new HashMap<String,ArrayList<Integer>>();
	    ArrayList<String> keySet = new ArrayList<String>();
	    while(line!=null){
	        String[] lines = line.split(" ");
	        ArrayList<Integer> list;
	        if(ansMap.containsKey(lines[0])){
	            list = ansMap.get(lines[0]);
	        }else{
	            list = new ArrayList<Integer>();
	            keySet.add(lines[0]);
	            ansMap.put(lines[0],list);
	        }
	        list.add(Integer.parseInt(lines[1]));
	        line = br.readLine();
	    }
	    Collections.sort(keySet);
	    for(String key:keySet){
	        System.out.println(key);
	        ArrayList<Integer> list = ansMap.get(key);
	        Collections.sort(list);
	        int i=0;
	        for(int j:list){
	            if(i!=0){
    	            System.out.print(" ");
	            }
	            i++;
	            System.out.print(j);
	        }
	        System.out.println("");
	    }
	}

}
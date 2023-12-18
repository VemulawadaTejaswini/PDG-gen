import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
	    String cline = calc(line);
	    int ans = 0;
	    while(!line.equals(cline)){
	        line = cline;
	        cline = calc(line);
	        ans++;
	    }
	    System.out.println(ans);
	    System.out.println(line);
    }
    public static String calc(String line){
        HashMap<String,Integer> numMap = new HashMap<String,Integer>();
        String[] lines = line.split(" ");
        for(String st:lines){
            if(numMap.containsKey(st)){
                numMap.put(st,numMap.get(st)+1);
            }else{
                numMap.put(st,1);
            }
        }
        StringBuilder ans = new StringBuilder();
        boolean fst = true;
        for(String st:lines){
            if(!fst){
                ans.append(" ");
            }
            fst = false;
            ans.append(numMap.get(st));
        }
        return ans.toString();
    }
}



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
            
            while((line=br.readLine())!=null){
                if(line.equals(""))break;
                String[] splited = line.split(" ");
                int m = Integer.parseInt(splited[0]);
                if(hm.containsKey(m))hm.put(m, hm.get(m)+1);
                else hm.put(m,1);
            }
            ArrayList<Integer> maxes = new ArrayList<Integer>();
            int max=0;
            for(int key:hm.keySet()){
                //System.out.println(max+"al"+Arrays.toString(maxes.toArray()));
                if(hm.get(key)<max)continue;
                if(hm.get(key)>max){max=hm.get(key);maxes.clear();}
                maxes.add(key);                    
                               // System.out.println(max+"al"+Arrays.toString(maxes.toArray()));

            }
            for(int i:maxes)System.out.println(i);
        }catch(Exception e){e.printStackTrace();}
    }
}
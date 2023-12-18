import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        ArrayList<Long> cml = new ArrayList<>();
        cml.add((long)0);
        int cont = 0;
        for (String s:str.split(" ")){
            cml.add(cml.get(cont)+Integer.parseInt(s));
            cont++;
        }
        HashMap<Long,Long> map = new HashMap<>();
        for (long key:cml){
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            } else {
                map.put(key,(long)1);
            }
        }
        long ans = 0;
        for (long key:map.keySet()){
            ans += (map.get(key) * (map.get(key)-1))/2;
        }
        System.out.println(ans);
    }
}
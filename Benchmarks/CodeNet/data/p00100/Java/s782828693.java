import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer,Double> map = new HashMap<Integer,Double>();

        String input;

        while((input = br.readLine()) != null){
            int n = Integer.parseInt(input);
            if(n == 0) break;
            
            map.clear();
            for(int i = 0; i < n; i++){
                String[] line = br.readLine().split(" ");
                int shine = Integer.parseInt(line[0]);
                if(map.containsKey(shine)){
                    map.put(shine, map.get(shine) + Double.parseDouble(line[1]) / 1000000 * Double.parseDouble(line[2]));
                }else{
                    map.put(shine, Double.parseDouble(line[1]) / 1000000 * Double.parseDouble(line[2]));
                }
            }

            boolean be = false;
            Object[] mapkey = map.keySet().toArray();
            Arrays.sort(mapkey);

            for(Object x : mapkey){
                if(map.get((Integer)x) >= 1.000000){
                    System.out.println(x);
                    be = true;
                }
            }

            if(!be){
                System.out.println("NA");
            }

        }
    }
}

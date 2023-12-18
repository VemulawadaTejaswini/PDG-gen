import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String line = br.readLine();
            int n = Integer.parseInt(line);
            
            if(n == 0)break;
            
            LinkedHashMap<Integer, Long> employee = new LinkedHashMap<Integer, Long>();
            
            for(int i = 0;i < n;i++){
                String[] dataSet = br.readLine().split(" ");
                int e = Integer.parseInt(dataSet[0]);
                int p = Integer.parseInt(dataSet[1]);
                int q = Integer.parseInt(dataSet[2]);
                
                if(employee.containsKey(e)){
                    employee.put(e, employee.get(e) + (long)p * q);
                }else{
                    employee.put(e, (long)p * q);
                }
            }
            
            boolean zeroFlag = true;
            for(int e : employee.keySet()){
                if(employee.get(e) >= 1000000){
                    zeroFlag = false;
                    System.out.println(e);
                }
            }
            if(zeroFlag){
                System.out.println("NA");
            }
        }
    }
}


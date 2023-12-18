import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int i=0;
        Map<Integer,Integer> store=new HashMap<Integer,Integer>();
        for(int j=0;j<30;j++){store.put(j+1, j+1);}
        int[] a=new int[2];
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	store.remove(Integer.parseInt(line));
                i++;
                if(i==28){
                	break;
                }
            }
            i=0;
            for(Map.Entry<Integer, Integer> e : store.entrySet()) {
            	a[i]=e.getValue();
            	i++;
            }
            System.out.println(Integer.min(a[0], a[1]));
            System.out.println(Integer.max(a[0], a[1]));
        }
    }

}
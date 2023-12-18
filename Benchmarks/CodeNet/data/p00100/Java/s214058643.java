import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sale_Result {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0;
        int i=0;
        boolean first=false;
        ArrayList arr=new ArrayList();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	if(line.equals("0")){
            		break;
            	}
            	String[] tokens = line.split(" ");
            	if(tokens.length==1){
            		i=0;
            		first=false;
            		map=new HashMap();
            		length=Integer.parseInt(tokens[0]);
            	}else{
            		int a= Integer.parseInt(tokens[0]);
            		int b = Integer.parseInt(tokens[1]);
            		int c = Integer.parseInt(tokens[2]);
            		if(map.get(a)==null){
            			map.put(a, b*c);
            		}else{
            			map.put(a, map.get(a)+b*c);
            		}
            		i++;
            	}
            	if(i==length){
            		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            			if(entry.getValue()>=1000000){
            				arr.add(entry.getKey());
                			first=true;
                		}
            		}

            		if(!first){
            			arr.add("NA");
            		}
            	}
            }
		}
		for(int k=0;k<arr.size();k++){
			System.out.println(arr.get(k));
		}
	}

}
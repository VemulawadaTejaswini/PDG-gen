import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0;
            Map<Integer,String> map=new HashMap<Integer,String>();
            boolean[][] card=new boolean[4][14];
            while ((line = br.readLine()) != null) {
            	if(first){
            		n=Integer.parseInt(line);
            		map.put(0, "S");
            		map.put(1, "H");
            		map.put(2, "C");
            		map.put(3, "D");
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		if(str[0].equals("S")){
            			card[0][Integer.parseInt(str[1])]=true;
            		}else if(str[0].equals("H")){
            			card[1][Integer.parseInt(str[1])]=true;
            		}else if(str[0].equals("C")){
            			card[2][Integer.parseInt(str[1])]=true;
            		}else if(str[0].equals("D")){
            			card[3][Integer.parseInt(str[1])]=true;
            		}
            		i++;
            		if(i==n){
            			for(int j=0;j<4;j++){
            				String a=map.get(j);
            				for(int l=1;l<14;l++){
            					if(!card[j][l]){
            						System.out.println(a+" "+l);
            					}
            				}
            			}
            			break;
            		}
                	
            	}
            }
        }
    }

}
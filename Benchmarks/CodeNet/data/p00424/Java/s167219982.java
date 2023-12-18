import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0,out=0;
        int i=0,rou=0,store=1,sc=0;
        int state=0;
        List<Integer> score=new ArrayList<Integer>();
        Map<String,String> map=new HashMap<String,String>();
        String str="";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {

            	if(state==0||state==2){
            		if(line.equals("0")){
                    	break;
                    }
            		str="";
            		sc=Integer.parseInt(line);
            		i=0;
            		if(state==0){
            			map.clear();
            		}
            		state=state==0?1:3;

            	}else if(state==1){
            		String[] token=line.split(" ");
            		map.put(token[0],token[1]);
            		i++;
            		if(i==sc){
            			state=2;
            		}
            	}else if(state==3){
            		i++;
            		if(map.containsKey(line)){
            			str+=map.get(line);
            		}else{
            			str+=line;
            		}
            		if(i==sc){
                		System.out.println(str);
                		state=0;
                	}
            	}
            }

		}
	}

}
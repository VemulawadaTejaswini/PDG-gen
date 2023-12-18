import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // ???????????????????¨??????§
        // Let's ?????£??¬????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int now=0;
        int out_cnt=0;
        int base=0; 
        int point=0;
        while(now<n){
        	String line2 = br.readLine();
        	if(line2.equals("HIT")){
        		base++;
        		if(base>3){
        			point++;
        			base--;
        		}
        	}else if(line2.equals("OUT")){
        		out_cnt++;
        		
        	}else if(line2.equals("HOMERUN")){
        		point+=base+1;
        		base=0;
        	}
        	if(out_cnt>=3){
        		now++;
        		base=0;
        		out_cnt=0;
        		System.out.println(point);
        		point=0;
        	}
        	System.out.println("BASE:"+base+" OUT:"+out_cnt+" POINT:"+point);
        }

    }
}
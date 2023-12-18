import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int sum=0,length=0,num=0;
        String match="IOI";
        int time=0;
        int[][] block = null;
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0")){
            		break;
            	}
            	if(first){
            		num=Integer.parseInt(line);
            		length=Integer.parseInt(br.readLine());
            		for(int k=0;k<num-1;k++){
            			match+="OI";
            		}
            		sum=0;
            		first=false;
            	}else{
            		for(int k=0;k<length-match.length()+1;k++){
            			if(match.equals(line.substring(k, k+match.length()))){
            				sum++;
            			}
            		}
            		first=true;
            		System.out.println(sum);
            	}
            }
        }
    }
}
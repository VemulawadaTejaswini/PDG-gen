import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,num=0;
        boolean[] card=null;
        int[][] result=null;
        boolean first=true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(line.equals("0")){
            		break;
            	}else{
            		sum=0;
            		int mon=1000-Integer.parseInt(line);
            		while(mon!=0){
            			if(mon>=500){
            				mon-=500;
            			}else if(mon>=100){
            				mon-=100;
            			}else if(mon>=50){
            				mon-=50;
            			}else if(mon>=10){
            				mon-=10;
            			}else if(mon>=5){
            				mon-=5;
            			}else if(mon>=1){
            				mon-=1;
            			}
            			sum++;
            		}
            		System.out.println(sum);
            	}
            }
         }
	}
}
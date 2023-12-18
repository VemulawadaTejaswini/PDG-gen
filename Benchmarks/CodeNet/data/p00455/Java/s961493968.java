import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0,out=0;
        int i=0,rou=0,store=1,sc=0;
        int state=0;


		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	i++;
            	String[] tokens=line.split(" ");
            	int[] time=new int[line.length()];
            	int[] result=new int[3];
            	for(int k=0;k<tokens.length;k++){
            		time[k]=Integer.parseInt(tokens[k]);
            	}
            	if(time[2]>time[5]){
            		time[1]++;
            		result[0]=(60-time[2]+time[5]);
            	}else{
            		result[0]=(time[5]-time[2]);
            	}
            	if(time[1]>time[4]){
            		time[0]++;
            		result[1]=(60-time[1]+time[4]);
            	}else{
            		result[1]=(time[4]-time[1]);
            	}
            	result[2]=time[3]-time[0];

            	System.out.println(result[2]+" "+result[1]+" "+result[0]);
            	if(i==3){
            		break;
            	}

            }

		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,tate=0,yoko=0;
        int[] atari=null;
        boolean first=true;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(first){
            		tate=Integer.parseInt(str[0]);
            		yoko=Integer.parseInt(str[1]);
            		first=false;
            	}else{
            		String[] cloud=new String[yoko];
            		i++;
            		int time=-1;
            		boolean cl=false;
            		for(int k=0;k<cloud.length;k++){
            			if(line.substring(k,k+1).equals("c")){
            				cloud[k]="0";
            				time=0;
            				cl=true;
            			}else if(cl){
            				time++;
            				cloud[k]=String.valueOf(time);
            			}else{
            				cloud[k]=String.valueOf(time);
            			}
            		}
            		System.out.println(String.join(" ", cloud));
            		if(tate==i){
            			break;
            		}
            	}
            }
        }
	}

}
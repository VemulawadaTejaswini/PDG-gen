import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int i=0;
        int[] sum=new int[2];
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	String[] tokens = line.split(" ");
                for(int j=0;j<4;j++){
                	sum[i]+=Integer.parseInt(tokens[j]);
                }
                i++;
                if(i==2){
                	break;
                }
            }
            System.out.println(Integer.max(sum[0],sum[1]));
        }
    }

}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,n=0,m=0;
        int[] bibs=null;
        int[][] result=null;
        boolean first=true;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		String[] str=line.split(" ");
            		n=Integer.parseInt(str[0]);
            		m=Integer.parseInt(str[1]);
            		bibs=new int[n+1];
            		i=0;
            		first=false;
            	}else{
            		i++;
            		bibs[i]=Integer.parseInt(line);
            		if(i==n){
            			for(int k=1;k<=m;k++){
            				for(int j=1;j<n;j++){
            					if(bibs[j]%k>bibs[j+1]%k){
            						int w=bibs[j];
            						bibs[j]=bibs[j+1];
            						bibs[j+1]=w;
            					}
                			}
            			}
            			for(int j=1;j<n+1;j++){
                			System.out.println(bibs[j]);
                		}
            			break;
            		}

            	}
            }
         }
	}

}
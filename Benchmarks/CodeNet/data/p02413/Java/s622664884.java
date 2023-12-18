import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0,m=0;
            int[][] card=null;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
            	if(first){
            		n=Integer.parseInt(str[0]);
            		m=Integer.parseInt(str[1]);
            		card=new int[n+1][m+1];
            		first=false;
            	}else{
            		int sum=0;
            		for(int j=0;j<m;j++){
            			card[i][j]=Integer.parseInt(str[j]);
            			card[n][j]+=Integer.parseInt(str[j]);
            			sum+=card[i][j];
            		}
            		card[i][m]=sum;
            		
            		i++;
            		if(i==n){
            			for(int j=0;j<n;j++){
            				card[n][m]+=card[j][m];
            			}
            			for(int j=0;j<n+1;j++){
            				for(int k=0;k<m+1;k++){
                    			System.out.print(card[j][k]);
                    			if(k!=m)System.out.print(" ");
                    		}
            				System.out.println();
                		}
            		}
            	}
            }
        }
    }

}
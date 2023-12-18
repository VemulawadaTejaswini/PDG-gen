import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int max=0,k=0;
        int game=0;
        int[][] g=null;
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		game=Integer.parseInt(line);
            		g=new int[game][3];
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		for(int i=0;i<3;i++){
            			g[k][i]=Integer.parseInt(str[i]);
            		}
            		k++;
                    if(game==k){
                        break;
                    }
            	}
            }
            int[] result=new int[game];
            int[] store;
            for(k=0;k<3;k++){
            	store=new int[game];
            	for(int j=0;j<game;j++){
            		for(int l=j+1;l<game;l++){
            			
                		if(g[j][k]==g[l][k]){
                			store[j]=-1;
                			store[l]=-1;
                		}
                	}
            	}
            	for(int l=0;l<game;l++){
        			if(store[l]!=-1){
        				result[l]+=g[l][k];
        			}
        			if(k==2){
        				System.out.println(result[l]);
        			}
        		}
            }
        }
    }

}
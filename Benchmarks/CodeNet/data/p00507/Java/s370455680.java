import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean first=true;
		int i=0,n=0;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int[] s=null;
            int[] store=null;

            while ((line = br.readLine()) != null ) {
            	if(first){
            		n=Integer.parseInt(line);
            		s=new int[n];
            		store=new int[n*n-n];
            		first=false;
            	}else{
            		s[i]=Integer.parseInt(line);
            		i++;
            		if(i==n){
            			int count=0;
            			for(int j=0;j<n;j++){
            				for(int k=0;k<n;k++){
            					if(j!=k){
            						String str=String.valueOf(s[j])+String.valueOf(s[k]);
            						store[count]=Integer.parseInt(str);
            						count++;
            					}
                			}
            			}

            			for(int j=0;j<3;j++){
            				int min=store[j];
            				int st=j;
            				for(int k=j+1;k<n*n-n;k++){
            					if(store[k]<min){
            						min=store[k];
            						st=k;
            					}
                			}
            				int w=store[st];
            				store[st]=store[j];
            				store[j]=w;
            			}
            			System.out.println(store[2]);
            			break;
            		}
            	}
            }

		}
	}

}
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int i=0,n=0,m=0,l=0;
            while ((line = br.readLine()) != null) {
            	byte[] a=line.getBytes ("US-ASCII");
            	
            	for(int j=0;j<a.length;j++){
            		if(a[j]<=90&&a[j]>=65){
            			a[j]+=32;
            		}else if(a[j]<=122&&a[j]>=97){
            			a[j]-=32;
            		}
            	}
            	System.out.println(new String(a,"US-ASCII"));
            	break;
            }
        }
    }

}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int length=0,n=0,i=0;
            Set[] set = null;
            
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
             	if(first){
            		length=Integer.parseInt(str[0]);
            		n=Integer.parseInt(str[1]);
            		set=new HashSet[length];
            		for(int j=0;j<length;j++){
            			set[j]=new HashSet();
            		}
            		first=false;
            	}else{
            		int a=Integer.parseInt(str[1]);
        			int b=Integer.parseInt(str[2]);
            		if(str[0].equals("0")){
            			set[a].add(b);
            			set[b].add(a);
            		}else{
            			if(set[a].contains(b)){
            				System.out.println(1);
            			}else{
            				System.out.println(0);
            			}
            		}
            		i++;
            		if(i==n){
            			break;
            		}
            	}
            }
        }
	}

}
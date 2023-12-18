import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int length=0,n=0,i=0;
            int[] store=null;
            while ((line = br.readLine()) != null) {
            	String[] str=line.split(" ");
             	if(first){
            		length=Integer.parseInt(str[0]);
            		n=Integer.parseInt(str[1]);
            		store=new int[length+1];
            		first=false;
            	}else{
            		if(str[0].equals("0")){
            			for(int j=Integer.parseInt(str[1]);j<=Integer.parseInt(str[2]);j++){
            				store[j]+=Integer.parseInt(str[3]);
            			}
            		}else{
            			System.out.println(store[Integer.parseInt(str[1])]);
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
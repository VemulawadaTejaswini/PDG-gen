import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int k=0,length=0,i=0,max=0,sum=0;
            boolean first=true;
            int[] card=null;
            
            while ((line = br.readLine()) != null) {
            	if(line.equals("0 0"))break;
	            if(first){
	            	String[] tokens=line.split(" ");
	            	length=Integer.parseInt(tokens[0]);
	            	card=new int[length];
	            	k=Integer.parseInt(tokens[1]);
	            	first=false;
	            	i=0;
	            }else{
	            	card[i]=Integer.parseInt(line);
	            	i++;
	            	sum=0;
	            	if(i>=k){
	            		for(int j=i-k;j<i;j++){
	            			sum+=card[j];
	            		}
	            		if(i==k){
	            			max=sum;
	            		}else if(sum>max){
	            			max=sum;
	            		}
	            	}
	            	if(i==length){
	            		System.out.println(max);
	            		first=true;
	            	}
	            }
            }
        }
    }

}
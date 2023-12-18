import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean[] arg = null;
		int length=0;
        int i=0;
        boolean first=false;
        ArrayList arr=new ArrayList();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	String[] tokens = line.split(" ");
            	if(tokens.length==1){
            		System.out.println(tokens[0]);
            		if(tokens[0]=="0"){break;}
            		i=0;
            		first=false;
            		length=Integer.parseInt(tokens[0]);
            	}else{
            		int max,mid,min;
            		int a= Integer.parseInt(tokens[0]);
            		int b = Integer.parseInt(tokens[1]);
            		int c = Integer.parseInt(tokens[2]);
            		if(b*c>1000000){
            			arr.add(a);
            			first=true;
            		}
            		i++;
            	}
            	if(i==length){
            		if(!first){
            			arr.add("NA");
            		}
            	}
            }
		}
		for(int k=0;k<arr.size();k++){
			System.out.println(arr.get(k));
		}
	}

}
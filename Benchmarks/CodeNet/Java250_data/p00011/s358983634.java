import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		boolean first=true;
        String str="";
        int i=0,length=0;
        int[] amida = null;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		amida=new int[Integer.parseInt(line)];
            		for(int j=0;j<amida.length;j++){
            			amida[j]=j;
            		}
            		line = br.readLine();
            		length =Integer.parseInt(line);
            		first=false;
            	}else{
            		String[] tokens=line.split(",");
            		int store=amida[Integer.parseInt(tokens[0])-1];
            		amida[Integer.parseInt(tokens[0])-1]=amida[Integer.parseInt(tokens[1])-1];
            		amida[Integer.parseInt(tokens[1])-1]=store;
            		i++;
            		if(i==length){
            			break;
            		}
            	}
            }
            for(int k=0;k<amida.length;k++){
            	System.out.println(amida[k]+1);
            }
		}
	}

}
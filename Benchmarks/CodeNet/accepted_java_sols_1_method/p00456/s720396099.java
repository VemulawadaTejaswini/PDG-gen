import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int i=0;
		int[] w=new int[10],k=new int[10];

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null ) {
            	if(i<10){
            		w[i]=Integer.parseInt(line);
            	}else{
            		k[i-10]=Integer.parseInt(line);
            	}
            	i++;
            	if(i==20){
            		break;
            	}
            }
            int maxk=0,maxw=0;
            int resultk=0,resultw=0;
            int storek=0,storew=0;
            for(int l=0;l<3;l++){
            	maxk=0;
            	maxw=0;
            	storek=0;
            	storew=0;
            	for(int j=0;j<w.length;j++){
            		if(maxk<k[j]){
            			storek=j;
            			maxk=k[j];
            		}
            		if(maxw<w[j]){
            			storew=j;
            			maxw=w[j];
            		}
            	}
            	resultk+=maxk;
            	resultw+=maxw;
            	k[storek]=-1;
            	w[storew]=-1;

            }
            System.out.println(resultw+" "+resultk);
		}
	}

}
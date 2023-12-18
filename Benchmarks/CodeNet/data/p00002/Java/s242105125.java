import java.io.*;

public class Main{
    public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	try{
    		int keta;
	    	double num[] = new double[2];
    	   	String str[] = new String[200];

    		str[0] = br.readLine();
    		int i = 0;
    		while(str[i] != null){
    			i++;
    			str[i] = br.readLine();
	    	}
	    	br.close();

    		for (int j=0;j<i;j++){
	    		String str2[] = str[j].split(" ",0);
	    		num[0] = Double.parseDouble(str2[0]);
	    		num[1] = Double.parseDouble(str2[1]);

	    		keta = (int)Math.log10(num[0]+num[1]);
    			System.out.println(keta+1);

    			if(num[0]+num[1]==0){
    				break;
    			}
    		}
   		}catch(IOException e){
   			System.out.println("fail.");
 	  	}
	}
}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	        	String[] spl = line.split(" ");
	            int n = Integer.parseInt(spl[0]);
	            if(n==0){break;}

	            for(int i=0; i<n; i++){
	            	//System.out.println(i+"n"+n);
	            	line= br.readLine();//spl=line.split(" ");
	            	line=line.replaceAll("Hoshino", "Hoshina");
	            	System.out.println(line);


	            }//end FOR


            }//End WHILE


        }catch(Exception e){e.printStackTrace();}

    }


}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	        	String[] spl = line.split(" ");
	            int n = Integer.parseInt(spl[0]);
	            HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	            ArrayList<Integer> alist=new ArrayList<Integer>();
	            for(int i=0; i<n; i++){
	            	//System.out.println(i+"n"+n);
	            	line= br.readLine();spl=line.split(" ");
	            	int shainBan=Integer.parseInt(spl[0]);
	            	if(!alist.contains(shainBan)){ alist.add(shainBan); }
	            	int tanka = Integer.parseInt(spl[1]);
	            	int kazu = Integer.parseInt(spl[2]);
	            	if(hmap.containsKey(shainBan)){
	            		hmap.put(shainBan, hmap.get(shainBan)+tanka*kazu);
	            	}else{
	            		hmap.put(shainBan,tanka*kazu);
	            	}
	            }//end FOR
	//            System.out.println("aaa");

	            ArrayList<Integer>  clear = new ArrayList<Integer>();
	            String printline= "";
	            for(int i:alist){
//	            	System.out.println(i+" "+hmap.get(i));
	            	if(hmap.get(i)>=1000000){printline+=i+" ";}
	            	System.out.println(i);
	            }
	            printline=printline.trim();
	            if(printline.length()==0){printline= "NA";}
	            //System.out.println(printline);

            }//End WHILE


        }catch(Exception e){e.printStackTrace();}

    }


}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {



    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
            //store vector data.
            	String spl[] = line.split(" ");
        		int n = Integer.parseInt(spl[0]);
        		int[] ints = new int[n];

        		if(n==0){return ;}

        		line= br.readLine(); spl = line.split(" ");
        		for(int i = 0; i<n ; i++){
        			ints[i] = Integer.parseInt(spl[i]);
        		}

        		int count=0;
        		while(true){
        			int[] backup = Arrays.copyOf(ints, ints.length);
	        		count++;
	        		ints = makeC(ints);
	        		boolean sameflag = true;
	        		for(int i=0; i<ints.length; i++){
	        			if(ints[i] != backup[i]){sameflag = false; break;}
	        		}
	        		if(sameflag){break;}
        		}

	        		System.out.println(count-1);
	        		for(int i = 0; i<ints.length; i++){
	        			System.out.print(ints[i]);
	        			if(i!=ints.length-1){System.out.print(" ");}
	        		}System.out.println();

            }//End WHILE

        }catch(Exception e){e.printStackTrace();}

    }

    static  int[] makeC(int ints[]){
    	int[] ret = new int[ints.length];
    	for(int i=0; i<ints.length; i++){
    		for(int j=0; j<ints.length; j++){
    			if(ints[i]==ints[j]){ret[i]++;}
    		}
    	}
    	return ret;
    }

}
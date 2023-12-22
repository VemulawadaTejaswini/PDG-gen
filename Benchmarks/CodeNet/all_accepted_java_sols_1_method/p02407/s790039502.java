import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int n = Integer.parseInt(str);
	    str = br.readLine();
	    String [] ary = str.split(" ");
//	    int[] kaka = new int[n];
//	     for (int i=0 ; i<n ; i++){
//	    	 kaka[i] = Integer.parseInt(ary[i]);
//	     }

    //     Collection.reverse(ary);
	   //  System.out.println(Arrays.toString(kaka));
	    
	    for (int i= n-1; i>=0 ; i--){
	    	if (i !=0 ){
	    	 System.out.print(ary[i]+" ");}
	    	else { System.out.print(ary[i]);
	    	       System.out.print("\n");
	    	}
	     }

	}

	}
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args){

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int count = 0;
	try{
	    String N = br.readLine();
	    int n = Integer.parseInt(N);
	    String ox = br.readLine();
	    //System.out.println(ox);
	    String[] o_x = ox.split("");
	    for(int i=0;i<ox.length();i++){
		if(i==n-1){
		    //System.out.println("a");
		    continue;
		}
		if(ox.charAt(i) != ox.charAt(i+1)){
		    //System.out.println("b");
		    count++;
		    i++;
		}else{
		    //System.out.println("c");
		  
		}
	
	    }
	    System.out.println(count);
	}catch(Exception e){

	}	
	
    }
   
   
}



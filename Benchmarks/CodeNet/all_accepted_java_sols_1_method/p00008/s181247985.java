import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String args[]){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    int count = 0;
	    int[] val = new int[4];
	    while(null != (str = br.readLine())){
		int n = Integer.parseInt(str);
		count =0;
		if(n >= 37){ //満たすものなし
		    System.out.println("0");
		    continue;
		}
		else{
		    for (val[0] = 0; val[0] < 10; val[0]++) {
			for (val[1] = 0; val[1] < 10; val[1]++) {
			    for (val[2] = 0; val[2] < 10; val[2]++) {
				for (val[3] = 0; val[3] < 10; val[3]++) {
				    if((val[0]+val[1]+val[2]+val[3]) == n){
					count++;
				    }
				}
			    }
			}
		    }
		}
		System.out.println(count);
	    }
	}
	catch(Exception e){
	    System.exit(0);
	}
    }
}
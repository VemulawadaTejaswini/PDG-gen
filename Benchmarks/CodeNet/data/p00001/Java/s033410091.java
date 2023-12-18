import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main{
    public static void main(String args[]){
	try{
	    int x[] = new int[10];
	    Arrays.fill(x,0);
	    int temp;
	    InputStreamReader is = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(is);
	    for(int i=0;i<10;i++){
		x[i] = Integer.parseInt(br.readLine());
		if(x[0] < x[i]){
		    temp = x[0];
		    x[0] = x[i];
		    x[i] = temp;
		}
		if(x[1] < x[i]){
		    temp = x[1];
		    x[1] = x[i];
		    x[i] = temp;
		}
		if(x[2] < x[i]){
		    temp = x[2];
		    x[2] = x[i];
		    x[i] = temp;
		}
	    }
	    System.out.println(x[0]);
	    System.out.println(x[1]);
	    System.out.println(x[2]);
	}
	catch(Exception e){
	    System.out.printf("error");
	}
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = convertStringToInt(br.readLine().split(" "));
        int[] y = convertStringToInt(br.readLine().split(" "));

        calcMD(x,y,1);
        calcMD(x,y,2);
        calcMD(x,y,3);
        calcMD(x,y,0);

        br.close();
    }

	private static int[] convertStringToInt(String[] str){
		int[] list = new int[str.length];
		for(int i=0; i<str.length;i++){
			list[i] = Integer.parseInt(str[i]);
		}
		return list;
	}


    private static void calcMD(int[] x, int[] y,int p){
    	double D=0;
    	if(p == 0){
    		for(int i=0;i<x.length;i++){
    			double d = Math.abs(x[i]-y[i]);
    			if(D<=d){
    				D=d;
    			}
    		}
    	}else{
    		double d=0;
    		for(int i=0;i<x.length;i++){
    			d += Math.pow(Math.abs(x[i] - y[i]), p);
    		}
			D  =Math.pow(d, (double)1/p);
    	}
    	System.out.println(D);
    }
}
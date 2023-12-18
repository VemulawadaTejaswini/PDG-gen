import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] a){
    	String[] sl = new String[10];
    	InputStreamReader in = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(in);
    	//ArrayList<Integer> al = new ArrayList<Integer>();
    	//System.out.println(in.getEncoding());
    	for(int i =0; i<10;i++){
    		try{sl[i]= br.readLine();
    		if(i==9){
    			br.close();
    		}
    		}catch(Exception e){
    		}
    		}
    	int[] height = new int[10];
    	for(int i = 0; i<10; i++){
    		height[i]=Integer.parseInt(sl[i]);
    	}
    	Arrays.sort(height);
    	for(int i =7;i<=9;i++){
    	System.out.println(height[i]);
    	}
    	}
    }
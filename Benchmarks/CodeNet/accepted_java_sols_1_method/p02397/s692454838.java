import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] array = br.readLine().split(" ");
	        int x = Integer.parseInt(array[0]);
	        int y = Integer.parseInt(array[1]);
	        if(x==0&&y==0){
	        	break;
	        }else if(x>y){
	    		System.out.println(y+" "+x);
	        }else{
	        	System.out.println(x+" "+y);
	        }
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        if(a < b){
    		System.out.println("a < b");
        }else if(a > b){
        	System.out.println("a > b");
        }else{
        	System.out.println("a == b");
        }
	}
}
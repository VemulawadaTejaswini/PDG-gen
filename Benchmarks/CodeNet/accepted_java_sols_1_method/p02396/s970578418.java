import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		while(true){
        	int x=Integer.parseInt(br.readLine());
        	if(x==0) break;
    		i++;
    		System.out.println("Case "+i+": "+x);
        }
	}
}
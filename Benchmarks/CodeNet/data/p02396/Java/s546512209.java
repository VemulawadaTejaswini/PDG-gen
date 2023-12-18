import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr;
        int a;
        int times=0;

        while(true){
        	times++;
        	strArr = br.readLine();
            a=Integer.parseInt(strArr);

            if(a!=0){
            	System.out.println("Case "+times+": "+a);
            }
            else{
            	System.exit(0);
            }
        }
    }
}
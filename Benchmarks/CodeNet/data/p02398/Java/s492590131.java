import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        	String strArr[] = br.readLine().split(" ");
            int a=Integer.parseInt(strArr[0]);
            int b=Integer.parseInt(strArr[1]);
            int c=Integer.parseInt(strArr[2]);

            int kazu=0;
            int res=0;

            for(int i=a; i<=b; i++){
            	res=c%i;
            	if(res==0){
            		kazu++;
            	}
            	res=0;
            }
            System.out.println(kazu);
    }
}
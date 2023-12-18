import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str="";
        int[] a=new int[3];
        int i=0;
        try {
        		str = br.readLine();
                StringTokenizer st=new StringTokenizer(str," ");
    		     while (st.hasMoreTokens()) {
    		    	 a[i]=Integer.parseInt(st.nextToken());
    		    	 i++;
    		     }i=0;
                if(a[0] < a[1] && a[1] < a[2]){
                System.out.println("YES");
                }else{
                System.out.println("NO");
                }
                str="";
        } catch(IOException e) {
        	System.exit(0);
        }
    }
}
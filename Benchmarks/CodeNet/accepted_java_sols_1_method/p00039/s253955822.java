import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
    public static void main(String args[]){
        BufferedReader reader = 
        		new BufferedReader(new InputStreamReader(System.in));
        
        String st = "";
        int[] a = new int[100];
        int sum;
        try{
        while((st = reader.readLine()) != null){
        	
        	sum = 0;
            
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == 'I') a[i] = 1;
                if (st.charAt(i) == 'V') a[i] = 5;
                if (st.charAt(i) == 'X') a[i] = 10;
                if (st.charAt(i) == 'L') a[i] = 50;
                if (st.charAt(i) == 'C') a[i] = 100;
                if (st.charAt(i) == 'D') a[i] = 500;
                if (st.charAt(i) == 'M') a[i] = 1000;
                if (i != 0 && a[i - 1] < a[i]) {
                    a[i] -= a[i - 1];
                    a[i - 1] = 0;
                }
            }
            
            for (int i = 0; i < st.length(); i++) {
                sum += a[i];
            }
            
            System.out.println(sum);
        }
        }catch(IOException e){
    	}
        try{
        	reader.close();
        }catch(IOException e){
        }
    }
}
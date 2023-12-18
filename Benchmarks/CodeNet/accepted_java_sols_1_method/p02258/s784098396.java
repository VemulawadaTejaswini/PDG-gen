import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args){
    	//final int MAX =200000;
    	   try {
     final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	final int n = Integer.parseInt(reader.readLine());
    	//Scanner sc = new Scanner(System.in);
    	//int n = Integer.parseInt(sc.next());
    	//int n =sc.nextInt();
    	int[] R=new int[n];
    	
    	for(int i=0;i<n;i++){
    		// R[i]=Integer.parseInt(sc.next());
    		 R[i]=Integer.parseInt(reader.readLine());
    	}
    	int maxv=-2000000000;
    			 
    	int minv=R[0];
    	for(int i=1;i<n;i++){
    		maxv=Math.max(maxv,R[i]-minv);
    		minv=Math.min(minv,R[i]);
    	}
    	System.out.println(maxv);
        reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
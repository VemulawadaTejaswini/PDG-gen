import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] xy = new int[N][2];
        for(int i=0;i<N;i++) {
        	xy[i][0]=sc.nextInt();
        	xy[i][1]=sc.nextInt();
        }
        
        double sum=0;
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		if(i==j)continue;
//        		System.out.println(Math.pow(xy[i][0]-xy[j][0], 2)+Math.pow(xy[i][1]-xy[j][1], 2));  
        		sum=sum+Math.pow(Math.pow(xy[i][0]-xy[j][0], 2)+Math.pow(xy[i][1]-xy[j][1], 2), 0.5);
        	}
        }
//        System.out.println(sum);        	
        double ans=(double)sum/N;
        
        System.out.println(ans);        	
                		
    }
}
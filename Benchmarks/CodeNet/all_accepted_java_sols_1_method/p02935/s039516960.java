import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] v = new double[N];
     for(int i = 0; i < N; i++) {
        	v[i] = sc.nextDouble();
        }
      
        

        Arrays.sort(v);
      
      double sum1 = (v[0] + v[1])/2;
        
        if(N < 3) {
        	System.out.println(sum1);
        }else {
        	for(int i = 2; i < N; i++) {
            	sum1 = (sum1 + v[i])/2;
            }
            
            System.out.println(sum1);
        }
        
        sc.close();
    }
}

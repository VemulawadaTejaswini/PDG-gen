import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      
      	Integer a[] = new Integer[N+1];
        for (int i=1; i<=N; i++) {
            a[i] = 0;
        }
        for (int i=1; i<=N; i++) {
        	for(int x = 1; x<=20;x++){
            	for(int y = x; y<=70;y++){
                 	 for(int z = y; z<=100;z++){
                       if((x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x) == i){
                         if(x == y && y == z){
                         a[i] += 1;
                         } else {
                           a[i] += 3;
                         }
                       }     
        		    }
            	}
            }
        }
      
      	for (int i=1; i<=N; i++) {
            System.out.println(a[i]);
        }
         
    }
}
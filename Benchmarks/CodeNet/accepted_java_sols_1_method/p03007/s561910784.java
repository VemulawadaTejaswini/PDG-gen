

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] x = new Integer[N];
        for(int i = 0; i<N; i++) {
        	x[i] = sc.nextInt();
        }
        Arrays.sort(x, Comparator.reverseOrder());
//        for(int i = 0; i<N; i++) {
//        	System.out.println(x[i]);
//        }
        int M = 0;
        int pul = x[0];
        int mai = x[N-1];
        
        for(int i=1;i<N-1;i++) {
        	if(x[i]<0) {
        		pul = pul - x[i];
        	} else {
        		mai = mai - x[i];
        	}
         }
        M = pul - mai;
        System.out.println(M);
        
        int max=x[0];
        int min=x[N-1];
        for(int i=1;i<N-1;i++) {
        	if(x[i]<0) {
        		System.out.println(max + " " + x[i]);
        		max = max - x[i];
        	} else {
        		System.out.println(min + " " + x[i]);
        		min = min - x[i];
        	}        	
        }
        System.out.println(max + " " + min);
//        System.out.println(ans);
    }
}

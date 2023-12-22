import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] AC = new boolean[100005];
        int[] WA = new int[100005];
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int ac=0;
        int wa=0;
        
        for(int i=0;i<M;i++) {
            int p = sc.nextInt();
            String S = sc.next();
            if(S.equals("AC")) {
            	AC[p]=true;	
            } else {
            	if(AC[p]==false) {
            		WA[p]++;
            	}
            }            
        }
        
        for(int i=0;i<100005;i++) {
        	if(AC[i]==true) {
        		ac++;
        		wa=wa+WA[i];
        	}
        }
        
        System.out.println(ac + " " + wa);
    }

}
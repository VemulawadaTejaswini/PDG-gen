import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] p =new boolean[123456*2+1];
        Arrays.fill(p, true);
        p[0] = false;
        p[1] = false;
        
        for(int i = 2; i<p.length; i++){
            for(int j = 2; i*j <p.length; j++){
                if(!(p[i]))break;
                else
                    p[i*j] = false;
            }
        }
        
        int[] m = new int[p.length];
        m[0] = 0;
        
        for(int i = 1; i<m.length; i++){
            if(p[i])
                m[i] = m[i - 1] + 1;
            else
                m[i] = m[i - 1];
        }
        
        int n = sc.nextInt();
        while(n !=0){
            System.out.println(m[2*n]-m[n]);
            n = sc.nextInt();
        }
    
    }
}
        
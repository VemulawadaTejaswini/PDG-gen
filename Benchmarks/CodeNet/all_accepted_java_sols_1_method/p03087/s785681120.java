import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[Q];
        int[] r = new int[Q];

        for(int i=0; i<Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] ac = new int[N];
        ac[0] = 0;

        for(int i=1; i<N; i++){
            if(S.charAt(i)=='C' && S.charAt(i-1)=='A'){
                ac[i] = ac[i - 1] + 1;
            }
            else{
                ac[i] = ac[i - 1];
            }
        }

        for(int i=0; i<Q; i++){
            System.out.println(ac[r[i] - 1] - ac[l[i] - 1]);
        }
    }
}
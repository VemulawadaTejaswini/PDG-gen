import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();
        int[] j = new int[K];
        char[] k = new char[K];
        char[] t = new char[N];

        for(int i=0; i<K; i++){
            j[i] = 0;
        }

        for(int i=0; i<N; i++){
            if(i<K){
                t[i] = T.charAt(i);
                if(t[i]=='r'){
                    j[i] += P;
                    k[i] = 'p';
                }
                else if(t[i]=='s'){
                    j[i] += R;
                    k[i] = 'r';
                }
                else{
                    j[i] = S;
                    k[i] = 's';
                }
            }
            else{
                t[i] = T.charAt(i);
                if(t[i]=='r'){
                    if(k[i%K]!='p'){
                        j[i % K] += P;
                        k[i % K] = 'p';
                    }
                    else{
                        k[i % K] = 'a';
                    }
                }
                else if(t[i]=='s'){
                    if(k[i%K]!='r'){
                        j[i % K] += R;
                        k[i % K] = 'r';
                    }
                    else{
                        k[i % K] = 'a';
                    }
                }
                else{
                    if(k[i%K]!='s'){
                        j[i % K] += S;
                        k[i % K] = 's';
                    }
                    else{
                        k[i % K] = 'a';
                    }
                }
            }
        }
        int ans = 0;
        for(int i=0; i<K; i++){
            ans += j[i];
        }
        System.out.println(ans);
    }
}
import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        long mod = (long)Math.pow(2,32);

        int dataset = sc.nextInt();
        while(dataset-->0){
            long[] N = new long[9];
            for(int i=0; i<9; i++){ 
                String s = sc.next();
                N[i] = Long.parseLong(s, 16);
            }

            long k = (long)0;

            for(int i=0; i<32; i++){
                long sum = (long)0;
                for(int j=0; j<8; j++) sum += N[j] ^ k;
                if((sum & (long)1<<i) != ((N[8] ^ k) & (long)1<<i)){
                    k |= (long)1<<i;
                }
            }
            System.out.println(Long.toString(k, 16));
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final long d = 5000000000000000L;
        String S = sc.next();
        long K = sc.nextLong();
        for(int i=0;i<S.length();i++){
            int cur = S.charAt(i)-'0';
            if(cur==1&&i+1<K) continue;
            if(cur==1&&i+1==K){
                System.out.println("1");
                System.exit(0);
            }
            if(cur!=1){
                System.out.println(cur);
                System.exit(0);
            }
        }
        System.out.println("1");
    }
}

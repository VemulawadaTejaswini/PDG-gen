import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] qac = new boolean[n+1];
        int[] qwa = new int[n+1];
        int ac = 0;
        int wa = 0;

        for(int i = 0;i < m;i++){
            int sub = sc.nextInt();
            String res = sc.next();
            if(res.equals("AC")){
                qac[sub] = true;
            }else{
                if(!qac[sub])
                    qwa[sub]++;
            }
        }
        for(int i = 1;i < n+1;i++){
            if(qac[i]){
                ac++;
                wa += qwa[i];
            }
                
        }
        System.out.println(ac+" "+wa);
    }
}
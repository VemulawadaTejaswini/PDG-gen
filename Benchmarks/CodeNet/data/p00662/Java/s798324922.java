import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int[] set = new int[3];
            set[0] = sc.nextInt();
            set[1] = sc.nextInt();
            set[2] = sc.nextInt();
            set[0] += sc.nextInt();
            set[1] += sc.nextInt();
            set[2] += sc.nextInt();

            if(set[0]==0 && set[1]==0 && set[2]==0) break;

            int num = set[0]/3+set[1]/3+set[2]/3;
            num += Math.min(set[0]%3, Math.min(set[1]%3, set[2]%3));

            int max = num;
            for(int i=0; i<1<<3; i++){
                int num2 = 0;
                int min = Integer.MAX_VALUE;
                for(int j=0; j<3; j++){
                    if(set[j]-3>=0 && (1<<j & 1)==0){
                        num2 += (set[j]-3)/3;
                        min = Math.min(min, set[j]%3+3);
                    }else{
                        num2 += set[j]/3;
                        min = Math.min(min, set[j]%3);
                    }
                }
                max = Math.max(max, num2+min);
            }

            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
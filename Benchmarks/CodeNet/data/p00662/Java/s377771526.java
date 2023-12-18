import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int set1 = sc.nextInt();
            int set2 = sc.nextInt();
            int set3 = sc.nextInt();
            set1 += sc.nextInt();
            set2 += sc.nextInt();
            set3 += sc.nextInt();

            if(set1==0 && set2==0 && set3==0) break;

            int max = 0;
            for(int i=0; i*3<=set1; i++){
                for(int j=Math.max((set2-(set1-i*3))/3, 0); j*3<=set2; j++){
                    int x = Math.min(set1-i*3, set2-j*3);
                    for(int k=Math.max((set3-x)/3, 0); k*3<=set3; k++){
                        int num = Math.min(x, set3-k*3);
                        max = Math.max(max, i+j+k+num);
                    }
                }
            }

            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
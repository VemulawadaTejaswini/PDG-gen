import java.util.*;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[M];
        int[] P = new int[M];

        for(int i=0;i<M;i++){
            int k = sc.nextInt();
            for(int j=0;j<k;j++){
                int num = sc.nextInt();
                s[i] += (int)Math.pow(2,num-1);
            }
        }
        for(int i=0;i<M;i++) {
            P[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i=0;i<Math.pow(2,N);i++){

            //System.out.println("i"+i);

            boolean isOK =true;

            for(int j=0;j<M;j++){
                int modCount = 0;
                int a = i;
                int b = s[j];

                for(int k=N;k > 0;k--){
                    int modNum = (int)Math.pow(2,k-1);
                    if((a / modNum == 1) && (b / modNum == 1)){
                        //System.out.println("same");
                        modCount++;
                    } else {
                        //System.out.println("NG");
                    }
                    a = a % modNum;
                    b = b % modNum;
                }

                if(modCount % 2 != P[j]){
                    isOK = false;
                    break;
                }
            }

            if(isOK){
                ans++;
            }

        }
        System.out.println(ans);
    }



}

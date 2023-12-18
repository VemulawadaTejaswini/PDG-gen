import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int ans = 0;
        int[] timecnt = new int[M];

        for(int i=0;i<N;i++){
            A[i] = scanner.nextInt();
        }

        for(int i=0;i<M;i++){
            B[i] = scanner.nextInt();
        }

        for(int i=0;i<M;i++){
            timecnt[i] = 0;
        }

        int time = 0;
        int temp = 0;
        int maxAcnt = 0;
        for(int i=0;i<N;i++){
            if(time + A[i] > K){
                break;
            }
            else{
                time += A[i];
                maxAcnt ++;
            }
        }


        time =0;
        for(int j=0;j<N;j++){
            for(int i=0;i<N-j;i++){
                if(time + A[i] > K){
                    break;
                }
                else{
                    time += A[i];
                    timecnt[j] +=1;
                }
            }
            for(int i=0; i<M;i++){
                if(time + B[i] > K){
                    break;
                }
                else{
                    time += B[i];
                    timecnt[j] +=1;
                }
            }
        }

        /*
        for(int i=0;i<M;i++){
            System.out.println(timecnt[i]);
        }
        */

        ans = timecnt[0];
        //System.out.println(ans);
        for(int i=0;i<M;i++){
            if(timecnt[i] != 0){
                if(temp < timecnt[i]){
                    ans = timecnt[i];
                }
                temp = timecnt[i];
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner("4 1 2 2 1");
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        boolean flag = true;
        int cnt = 0;

        while(flag){
            flag = false;
            boolean prevPlus = false;
            for(int i=0;i<n;i++){
                if(prevPlus){
                    if(h[i]>0){
                        h[i]--;
                        continue;
                    }else{
                        prevPlus = false;
                        continue;
                    }
                }else{
                    if(h[i]>0){
                        flag = true;
                        prevPlus = true;
                        cnt++;
                        h[i]--;
                        continue;
                    
                    }else{
                        continue;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
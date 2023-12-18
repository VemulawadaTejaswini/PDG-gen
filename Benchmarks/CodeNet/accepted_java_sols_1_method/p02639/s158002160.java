import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int ans = 6;
        for(int i = 0;i<x.length;i++){
            x[i] = sc.nextInt();
            if(x[i]==0){
                ans  = i;
            }
        }
        System.out.println(ans+1);

    }
}

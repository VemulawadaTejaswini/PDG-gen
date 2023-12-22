import java.util.*;

class Main{
    //148c
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        //int[] dif = new int[n];
        int ans=0;
        int count = 1;
        boolean poyo = false;
        for(int i = 0;i < n;i++){
            ary[i] = sc.nextInt();
            if(ary[i]==count){
                count++;
                poyo = true;
            }else{
                ans++;
            }
        }
        if(poyo){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }

    }
    
}
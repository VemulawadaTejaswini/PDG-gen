import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            ans[sc.nextInt()-1] = i;
        }
        for(int i = 0;i<n;i++){
            System.out.print((ans[i]+1)+" ");
        }
    }
}
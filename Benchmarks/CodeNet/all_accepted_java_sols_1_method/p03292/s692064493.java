import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int ans;
        for(int i = 0;i < 3;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        ans = (A[1]-A[0])+(A[2]-A[1]);
        System.out.println(ans);
    }
}
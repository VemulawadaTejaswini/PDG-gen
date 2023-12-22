import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        boolean ans = true;
        for(int i =0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        int tmp = h[0];
        for(int i =1;i<n;i++){
            if(tmp<=h[i]-1){
                tmp = h[i]-1;
            } else if(tmp<=h[i]){
                tmp = h[i];
            } else {
                ans = false;
                break;
            }
        }
        System.out.println(ans?"Yes":"No");
    }
}
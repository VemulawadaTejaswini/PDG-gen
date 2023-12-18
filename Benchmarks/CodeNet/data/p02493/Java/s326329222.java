import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] retu = new int[n];
        for(int i=0;i<n;i++){
            retu[i] = sc.nextInt();
        }
        for(int i=n-1;i>0;i--){
            System.out.print(retu[i]+" ");
        }
        System.out.println(retu[0]);
    }
}
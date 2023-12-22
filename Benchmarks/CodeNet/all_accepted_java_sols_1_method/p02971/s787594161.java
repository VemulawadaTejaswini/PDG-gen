import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] acopy = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            acopy[i] = a[i];
        }
        Arrays.sort(a);

        for(int i =0;i < n;i++){
            /*if(a[n-1] == acopy[i]){
                System.out.println(a[n-2]);
            }else{
                System.out.println(a[n-1]);
            }*/
            System.out.println(a[n-1] != acopy[i] ? a[n-1] : a[n-2]);
        }

    }
}
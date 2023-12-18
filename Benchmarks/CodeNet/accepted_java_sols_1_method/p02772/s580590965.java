import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        boolean flag = true;
        for(int i=0; i<N; i++){
            if(a[i]%2 == 0){
                if(a[i]%3 == 0 || a[i]%5 == 0){
                } else {
                    flag = false;
                }
            }
        }
        
        if(flag) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}
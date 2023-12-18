import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int k = sc.nextInt();
        for(int i=1;i<=k;i++){
            if(i%2==1){
                if(A%2==1) A--;
                B += A/2;
                A -= A/2;
            } else{
                if(B%2==1) B--;
                A += B/2;
                B -= B/2;
            }
        }
        System.out.print(A);
        System.out.print(" ");
        System.out.print(B);
    }
}

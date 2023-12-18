import java.util.Scanner;

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()+1;
        long[] A = new long[N];
        long branch = 0;
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextLong();
            branch += A[i];
        }
        branch--;

        long ans = 0;
        long nowLeaf = 1;
        for(int i = 0 ; i < N ; i ++){
            ans += nowLeaf;
            nowLeaf -= A[i];
            if(nowLeaf < 0){
                ans = -1;
                break;
            }
            if(nowLeaf <= branch){
                branch -= nowLeaf;
                nowLeaf *= 2;
            }else{
                nowLeaf += branch;
                branch = 0;
            }
        }

        System.out.println(ans);
    }
}
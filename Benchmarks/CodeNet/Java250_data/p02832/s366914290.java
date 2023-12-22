import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i =0;i<N;i++){
           a[i] = sc.nextInt();
        }
        int resultflag = 1;
        for (int i =0;i<N;i++){
            if(a[i]==resultflag){
                resultflag++;
            }
        }
        if(resultflag==1){
            System.out.println(-1);
        }else {
            System.out.println(N-resultflag+1);
        }
    }
}

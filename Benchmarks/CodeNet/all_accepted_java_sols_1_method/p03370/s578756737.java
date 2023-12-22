import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        int[] M = new int[N];
        int tmp = 1000;
        int cou = N;
        for(int i = 0;i<N;i++){
            M[i] = Integer.parseInt(scan.next());
            X -= M[i];
            if(tmp>M[i]){
                tmp = M[i];
            }
        }
        int count = X/tmp;
        System.out.println(cou+count);
    }
}
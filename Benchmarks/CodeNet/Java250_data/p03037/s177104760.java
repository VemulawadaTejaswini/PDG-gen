import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int mi = N;
        int ma = 1;
        for(int i = 0;i < M;i++){
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if(ma < l){
                ma = l;
            }
            if(mi > r){
                mi = r;
            }
        }
        if(ma > mi){
            System.out.println(0);
        }else{
            System.out.println(mi-ma+1);
        }
    }
}
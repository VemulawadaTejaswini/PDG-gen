import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int now = 0;
        int count = 1;
        for(int i=0;i<N;i++){
            now = now + sc.nextInt();
            if(now <= X)count++;
        }
        System.out.println(count);
    }
}
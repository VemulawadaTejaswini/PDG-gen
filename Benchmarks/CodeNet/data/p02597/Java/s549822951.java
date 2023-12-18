import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] stone = sc.nextLine().toCharArray();
        sc.close();

        int R =0;
        int W =0;
        for(int i=0; i<N; i++){
            if(stone[i]=='R') R++;
            else W++;
        }
        if(W==0 || R==0) System.out.println("0");
        else{
            int n = 0;
            for(int i=0; i<R; i++){
                if(stone[i] == 'W') n++;
            }
            System.out.println(n);
        }
    }
}

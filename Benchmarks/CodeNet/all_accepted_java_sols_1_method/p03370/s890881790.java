import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int X = stdIn.nextInt();

        int min = 100001;
        
        for(int i = 0; i < N; i++){
            int m = stdIn.nextInt();
            X -= m;
            if(min > m)
                min = m;

        }

        int cnt = N;

        X -= min;
        while(X > -1){
            cnt++;
            X -= min;
        }
        System.out.println(cnt);
        
    }
}
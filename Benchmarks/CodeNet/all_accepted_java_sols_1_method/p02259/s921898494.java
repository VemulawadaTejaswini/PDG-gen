import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int l[] = new int[N];
        //System.out.println(N);

        for(int i = 0;i<N;i++){
        
            l[i] = sc.nextInt();
            //System.out.println(l[i]);
        }
        
        int temp,num = 0, M;

        M = N;

        if(N == 1){

            System.out.println(l[0]);
            System.out.println(0);
        }else{

        while(true){

            for(int i = 0;i<M-1;i++){
                if(l[i] > l[i+1]){

                    temp = l[i];
                    l[i] = l[i+1];
                    l[i+1] = temp;

                    num++;

                }
            }
            M--;
            if(M==1){
                break;
            }
        }

        for(int i = 0;i<N;i++){
            if(i == N-1){
                System.out.println(l[i]);
            }else{
            System.out.print(l[i] + " ");
            }
        }
        //System.out.println("\n");
        System.out.println(num);
    }
    }
}

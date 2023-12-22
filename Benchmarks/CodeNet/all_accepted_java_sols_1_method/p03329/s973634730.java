import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int count = N;

        for(int i = 0 ; i <= N ; i++){
            int cc  = 0;
            int tmp = i;
            
            while(tmp > 0){
                cc += tmp % 6;
                tmp /= 6;
            }

            tmp = N - i;

            while(tmp > 0){
                cc += tmp % 9;
                tmp /= 9;
            }

            if(count > cc){
                count = cc;
            }
        }

        System.out.println(count);
    }
}
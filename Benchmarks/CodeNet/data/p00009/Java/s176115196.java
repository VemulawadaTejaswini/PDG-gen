import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] prime;
    static int n;

    public static void main(String[] args) {
        while(read()){
            slove();
        }
    }
    static boolean read(){
        if(!sc.hasNextInt())
            return false;
        n = sc.nextInt();
        return true;
    }
    static void Prime(int a){
        prime = new int[a+1];
        for(int i = 2; i < prime.length; i++)prime[i] = 1;

        for(int i = 2; i < prime.length; i++){
            if(prime[i] == 1){
                for(int j = i*2; j < prime.length; j+= i)
                    prime[j] = 0;
            }
        }
    }

    static void slove(){
        int res = 0;
        Prime(n);
        for(int i = 2; i < prime.length; i++){
            if(prime[i] == 1)
                res++;
        }
        System.out.println(res);
    }
}
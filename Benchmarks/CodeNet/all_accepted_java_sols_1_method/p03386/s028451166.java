import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int k = stdIn.nextInt();

        if(a+k-1 < b-k+1) {
            for(int i = 0; i < k; i++)
                System.out.println(a+i);
            for(int i = 0; i < k; i++)
                System.out.println(b-k+1+i);
        }
        else
            for(int i = a; i < b + 1; i++)
                System.out.println(i);
    }
}
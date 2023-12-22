import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int M=stdIn.nextInt();
        int N=stdIn.nextInt();

        System.out.println(M*(M-1)/2+N*(N-1)/2);
        
        
        
    }

}
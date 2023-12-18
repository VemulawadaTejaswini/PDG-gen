import java.util.*;

class Main{

    public Main(){
        int N,A;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for(int i=0;i<N;i++){
            A = scanner.nextInt();
            if((A & 1) == 0){
                if(A%5 != 0 & A%3!=0){
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
    }

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }
}

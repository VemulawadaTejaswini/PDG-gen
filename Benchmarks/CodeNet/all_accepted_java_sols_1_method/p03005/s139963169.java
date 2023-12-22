import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int masu = N-K;
          
        if(K<2){System.out.println("0");}
        else{ System.out.println(masu);}


      
    }
}
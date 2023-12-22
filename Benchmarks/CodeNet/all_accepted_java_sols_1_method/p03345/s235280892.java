
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int A=scanner.nextInt();
        final int B=scanner.nextInt();
        final int C=scanner.nextInt();
        final String kString=scanner.next();
        int K=Integer.parseInt(kString.split("")[kString.length()-1]);
        if(K%2==0){
            System.out.println(A-B);
        }else{
            System.out.println(B-A);
        }

    }
}
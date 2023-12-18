import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K=scan.nextInt();
        String N=scan.next();
        String append="...";
        if(N.length()<=K){
            System.out.println(N);
        }
        else if(N.length()>K){
            for(int i=0; i<K;i++){
                System.out.print(N.charAt(i));
            }
            System.out.print(append);
        }
    }
}

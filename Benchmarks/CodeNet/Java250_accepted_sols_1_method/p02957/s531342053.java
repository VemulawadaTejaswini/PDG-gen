import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int  k = 0 ;
        for(int i = 0 ; i<Integer.MAX_VALUE ; i++){
        if((a-i)==-(b-i)){
            k = i;
            break ;
        }
       
}
        if(k>0) System.out.println(k);
        else System.out.println("IMPOSSIBLE");
    }
}

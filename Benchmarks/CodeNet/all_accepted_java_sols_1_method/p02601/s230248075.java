import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            if(a < b){
                if(b < c){
                    System.out.println("Yes");
                    return;
                }else{
                    c *= 2;
                }
            }else{
                b *= 2;
            }
            if(a < b && b < c){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}

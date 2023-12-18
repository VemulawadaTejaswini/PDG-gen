import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            int n = sc.nextInt();
            int a = sc.nextInt();
            if(n == 0 && a == 0)break;
            if(n < a){
                System.out.print(n+" "+a);
            }else{
                System.out.print(a+" "+n);
            }
            System.out.println();
            i++;
            sc.nextLine();
        }
        //System.out.println();
    }
}

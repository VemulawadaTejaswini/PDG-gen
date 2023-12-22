import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int n = a/k;
        while(n*k<=b){
            if(n*k>=a && n*k<=b){
                System.out.println("OK");
                return;
            }
            n++;
        }
        System.out.println("NG");
        return;
    }
}

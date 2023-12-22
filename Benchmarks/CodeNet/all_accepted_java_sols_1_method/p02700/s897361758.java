import java.util.*;

class Main{
    static int mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        while(a>0 || c>0){
            c = c-b;
            if(c<=0){
                System.out.println("Yes");
                break;
            }
            a = a-d;
            if(a<=0){
                System.out.println("No");
                break;
            }
        }
        
    }
}

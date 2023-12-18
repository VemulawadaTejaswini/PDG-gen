import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        if( b - a >= 2 * k - 1){
            for(int i = 0; i < k; i++){
                System.out.println(a + i);
            }
            for(int i = k - 1; i >= 0; i--){
                System.out.println(b - i);
            }
        }
        else{
            for(int i = a; i <= b; i++){
                System.out.println(i);
            }
        }
    }
}

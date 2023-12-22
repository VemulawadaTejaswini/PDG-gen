import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        for(int i = 0; i < k; i++){
            if(i % 2 == 0){
                if(a % 2 == 0) a /= 2;
                else a = (a-1)/2;
                b += a;
            }
            else{
                if(b % 2 == 0) b/=2;
                else b = (b-1) / 2;
                a += b;
            }
        }
        System.out.println(a + " " + b);
    }
}
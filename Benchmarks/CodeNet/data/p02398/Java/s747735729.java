import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = 0;
        int k = 0;
        for(int i = a;i <= b;i++){
            t = c % i;
            if(t == 0){
                k++;
            }
        }
        System.out.println(k);
    }
}


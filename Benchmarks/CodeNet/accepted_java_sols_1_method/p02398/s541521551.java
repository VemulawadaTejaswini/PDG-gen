import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        while (true){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            if (a == 0 && b==0) break;
//            if ( a > b){
//                b = swap(a, a=b);
//            }
//            System.out.println(a + " " +b);
//        }
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a ; i<=b ; i++){
            if (c % i == 0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


        int syou = a / k;
        
        if( a % k == 0 ){
            System.out.println("OK");
        }else{
            if( (syou + 1)*k > b ){
                System.out.println("NG");
            }else{
                System.out.println("OK");
            }
        }
       

    }
}
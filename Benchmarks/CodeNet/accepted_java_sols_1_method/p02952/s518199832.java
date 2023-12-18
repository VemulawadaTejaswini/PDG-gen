import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 9) System.out.println(n);
        else if(n <= 99)System.out.println(9);
        else if(n <= 999)System.out.println(n-90);
        else if(n <= 9999)System.out.println(909);
        else if(n <= 99999)System.out.println(n-9090);
        else System.out.println(90909);
    }
}
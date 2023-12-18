import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        

        int ab= a<b ? a: b;
        int cd=c<d ? c : d;
        System.out.println(ab+cd);
        
    }
}
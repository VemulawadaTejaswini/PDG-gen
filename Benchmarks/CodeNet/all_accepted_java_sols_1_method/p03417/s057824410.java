import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(x==2 || y==2) System.out.println(0);
        else System.out.println(Math.max(x-2,1)*Math.max(1,y-2));
    }
}
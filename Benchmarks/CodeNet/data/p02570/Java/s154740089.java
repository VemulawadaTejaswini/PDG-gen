import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double t = sc.nextDouble();
        double s = sc.nextDouble();
        if(s >= Math.ceil((d/t))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
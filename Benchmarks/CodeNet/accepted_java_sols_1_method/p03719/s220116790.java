import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ans = "No";
        if(C>=A&&C<=B) ans = "Yes";
        System.out.println(ans);
    }
}
 
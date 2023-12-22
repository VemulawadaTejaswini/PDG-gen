import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ans = (A%2==1&&B%2==1)?"Yes":"No";
        System.out.println(ans);
    }
}


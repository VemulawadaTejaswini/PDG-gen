import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        String ans = "Yes";
        if(S.charAt(A)!='-') ans = "No";
        for(int i=1;i<=A;i++){
            if(S.charAt(i-1)<'0'||S.charAt(i-1)>'9') ans = "No";
        }
        for(int i=A+2;i<=A+B+1;i++){
            if(S.charAt(i-1)<'0'||S.charAt(i-1)>'9') ans = "No";
        }

        System.out.println(ans);
    }
}

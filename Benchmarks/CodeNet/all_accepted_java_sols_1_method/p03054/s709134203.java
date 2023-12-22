import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int Sr = sc.nextInt();
        int Sc = sc.nextInt();
        String S = sc.next();
        String T = sc.next();


        //Row
        int left=0;
        int right=W -1;

        for (int i = N-1; i >=0; i--) {
            char s = S.charAt(i);
            char t = T.charAt(i);
            if(t=='R') left = Math.max(left-1,0);
            if(t=='L') right = Math.min(right+1,W-1);
            if(s=='L') left++;
            if(s=='R') right--;

            if(left>right){
                System.out.println("NO");
                return;
            }
        }

        int top=0;
        int bottom=H -1;
        for (int i = N-1; i >= 0 ; i--) {
            char s = S.charAt(i);
            char t = T.charAt(i);
            if(t=='D') top = Math.max(top-1,0);
            if(t=='U') bottom = Math.min(bottom+1,H-1);
            if(s=='U') top++;
            if(s=='D') bottom--;

            if(top>bottom){
                System.out.println("NO");
                return;
            }

        }

        if( left<=Sc-1 && Sc-1 <= right && top<= Sr-1 && Sr-1 <= bottom){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
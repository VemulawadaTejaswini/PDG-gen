import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int x = 0, y = 0;
        int ans1= 0, ans2= 0, adv1 = 0, adv2 = 0;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '(') adv1++;
            else if(c == ')'){
                if(adv1 <= 0) ans1++;
                adv1 = Math.max(0, adv1-1);
            }
        }
        for(int i = n-1; i >= 0; i--){
            char c = s.charAt(i);
            if(c == ')') adv2++;
            else if(c == '('){
                if(adv2 <= 0) ans2++;
                adv2 = Math.max(0, adv2-1);
            }
        }
        for(int i = 0; i < ans1; i++) System.out.print('(');
        System.out.print(s);
        for(int i = 0; i < ans2; i++) System.out.print(')');
    }
}
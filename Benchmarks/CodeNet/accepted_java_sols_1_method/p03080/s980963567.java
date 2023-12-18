import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0, b = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i)== 'R')a++;
            else if(s.charAt(i) == 'B')b++;
        }
        String ans = (a > b)?"Yes":"No";
        System.out.println(ans);
    }
}
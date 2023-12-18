import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] s = new String[N];

        for(int i = 0; i < N; i++){
            s[i] = sc.next();
        }

        String ans = "Yes";
        for(int i = 0; i < N-1; i++){
            if(s[i].charAt(s[i].length() - 1) != s[i+1].charAt(0)){
                ans = "No";
 //               System.out.println(s[i]);
                break;
            }
        }
        for(int i = 0; i < N - 1; i++)
        {
            for(int j = i+1; j < N; j++){
                boolean bl = true;
                int k = 0;
                if(s[i].length() == s[j].length()){
                    while(bl == true && k < s[i].length()) {
                        if(s[i].charAt(k) != s[j].charAt(k)){
 //                           System.out.println(s[i] + " " + s[j]);
                          bl = false;
                        }
                        k++;
                    }
                    if(bl == true){
                        ans = "No";
                        break;
                    }
                }
 //               System.out.println(bl);
            }
        }
        System.out.println(ans);
    }
}
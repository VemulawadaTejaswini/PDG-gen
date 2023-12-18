import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char str[] = s.toCharArray();
//        char str[] = new char[s.length()];
//        for (int i=0; i<s.length(); i++){
//            str[i] = s.indexOf
//        }

        int i = 0;
        while(i<s.length()){
            int r = 0;
            int l = 0;

            while(i<s.length() && str[i]=='R'){
                r++;
                i++;
            }
            while(i<s.length() && str[i]=='L'){
                l++;
                i++;
            }

            int R;
            int L;

            R = (int)Math.ceil(r/2.0);
            R += (int)l/2.0;

            L = (int)Math.ceil(l/2.0);
            L += (int)r/2.0;

            for (int j=0; j<r-1; j++) System.out.print(0+" ");
            System.out.print(R+" ");
            System.out.print(L+" ");
            for (int j=0; j<l-1; j++) System.out.print(0+" ");

        }

        }

    }

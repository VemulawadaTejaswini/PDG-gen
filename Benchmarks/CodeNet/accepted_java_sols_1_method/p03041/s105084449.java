import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        String S = sc.next();
        char[] str = new char[N];

        for(int i = 0;i < N;i++){
            str[i] = S.charAt(i);
            if(i == k-1){
                if(str[i] == 'A')
                str[i] = 'a';
                if(str[i] == 'B')
                str[i] = 'b';
                if(str[i] == 'C')
                str[i] = 'c';
            }
        }

        for(int i = 0;i < N;i++){
            System.out.print(str[i]);
        }

        

    }
}
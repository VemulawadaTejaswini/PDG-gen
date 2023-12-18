import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int l = S.length();
        char[] a = S.toCharArray();
        int child = 0;
        int[] ans = new int[l];
        int x = 0;
        int y = 0;

        for(int i=0; i<l-1; i++){
            child += 1;
            if(a[i]!=a[i+1] && a[i]=='R'){
                x = i;
                y = i + 1;
                ans[i + 1] += child / 2;
                ans[i] += child - child / 2 ;
                child = 0;
            }
            else if(a[i]!=a[i+1] && a[i]=='L'){
                ans[x] += child / 2;
                ans[y] += child - child / 2;
                child = 0;
            }
        }
        child += 1;
        ans[x] += child / 2;
        ans[y] += child - child / 2;
        System.out.print(ans[0]);
        for(int i=1; i<l-1; i++){
            System.out.print(" " + ans[i]);
        }
        System.out.println(" " + ans[l - 1]);
    }
}
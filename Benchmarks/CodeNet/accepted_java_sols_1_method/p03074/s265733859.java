import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args){
        int n = sc.nextInt(),K = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int left = 0;
        ArrayList<int[]> feet = new ArrayList<>();
        while(left<n){
            if(s[left]=='1') {
                left++;
                continue;
            }
            int right = left;
            while(right<n&&s[right]=='0') right++;
            feet.add(new int[]{left,right-1});
            left = right;
        }
        int ans = feet.size()==0?n:0;
        for(int i=0;i<feet.size();i++){
            left = i==0?0:(feet.get(i-1)[1]+1);
            int riIdx = Math.min(i+K-1,feet.size()-1);
            int right = riIdx==feet.size()-1?(n-1):(feet.get(riIdx+1)[0]-1);
            ans = Math.max(ans,right-left+1);
        }
        System.out.println(ans);
    }
}
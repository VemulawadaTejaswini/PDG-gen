import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] a = new String[H];
        int[] cnt = new int[26];
        for(int i = 0; i < H; i++){
            a[i] = sc.next();
            for(int j = 0; j < W; j++){
                cnt[(int)(a[i].charAt(j)-'a')]++;
            }
        }
        sc.close();

        int cnt4=0, cnt2=0, cnt1=0;
        for(int i = 0; i < 26; i++){
            cnt4 += cnt[i]/4;
            cnt2 += cnt[i]/2;
            if(cnt[i]%2 != 0)
                cnt1++;
        }
        if(H%2 == 0 && W%2 == 0){
            if(cnt4 == H*W/4)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if(H%2 != 0 && W%2 != 0){
            if(cnt1 == 1 && cnt4 >= (H-1)*(W-1)/4)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else if(H%2 == 0 && W%2 != 0){
            if(cnt1 == 0 && cnt4 >= H*(W-1)/4)
                System.out.println("Yes");
            else
                System.out.println("No");
        } else {
            if(cnt1 == 0 && cnt4 >= (H-1)*W/4)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
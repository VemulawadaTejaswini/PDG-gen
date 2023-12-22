import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] moti = new int[num];
        int ans = 1;
        for(int i = 0;i < num;i++){
            moti[i] = sc.nextInt();
        }
        Arrays.sort(moti);
        for(int i = 0;i < num-1;i++){
            if(moti[i] == moti[i+1])
            continue;
            ans++;
        }

        System.out.println(ans);
    }
}
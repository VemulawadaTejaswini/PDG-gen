import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for(int i=0;i<3;++i)n[i]=scan.nextInt();
        Arrays.sort(n);
        int ans = 0;
        while(n[1]<n[2]){
            ++ans;
            n[0]++;
            n[1]++;
        }
        while(n[0]<n[1]){
            ++ans;
            n[0]+=2;
        }
        if(n[0]>n[1])++ans;
        System.out.println(ans);


    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int[] s = new int[n];
            int min=100000,MAX=0,sum=0,ave=0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                if(min>s[i])min = s[i];
                if(MAX<s[i])MAX = s[i];
                sum+=s[i];
            }
            ave = (sum - min - MAX) / (n-2);
            System.out.println(ave);
        }
    }
}


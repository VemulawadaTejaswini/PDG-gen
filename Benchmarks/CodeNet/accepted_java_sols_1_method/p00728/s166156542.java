import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                if(n==0) break;
                int[] s = new int[n];
                for(int i=0;i<s.length;i++){
                    s[i]=sc.nextInt();
                }
                Arrays.sort(s);
                int sum=0;
                for(int i=1;i<s.length-1;i++){
                    sum+=s[i];
                }
                int answer = sum/(n-2);
                System.out.println(answer);
            }
        }
    }
}

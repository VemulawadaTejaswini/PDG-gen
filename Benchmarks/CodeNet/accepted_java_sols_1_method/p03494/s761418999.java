import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] s=new int[N];
        for(int i=0;i<N;i++){
            s[i]=sc.nextInt();
        }
        
        
        int count=0;
        boolean end=false;
        for(;!end;){
            for(int i=0;i<N;i++){
                if(s[i]%2==1){
                    end=true;
                }
            }
            if(!end){
                for(int i=0;i<N;i++){
                    s[i]=s[i]/2;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}

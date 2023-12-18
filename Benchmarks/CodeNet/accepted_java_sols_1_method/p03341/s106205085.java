import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        String S=sc.next();
        String[] s=new String[N];
        
        for(int i=0;i<N;i++){
            s[i]=S.substring(i,i+1);
        }
        int ans=0;
        for(int i=1;i<N;i++){
            if(s[i].equals("E")){
                ans++;
            }
        }
        int com=ans;
        for(int i=1;i<N;i++){
            if(s[i].equals("E")){
                com--;
            }
            if(s[i-1].equals("W")){
                com++;
            }
            if(com<ans){
                ans=com;
            }
        }
        System.out.println(ans);
    }
}

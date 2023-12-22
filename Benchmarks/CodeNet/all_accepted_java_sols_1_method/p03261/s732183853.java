import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n+1];
        w[0] = "zero";
        for(int i=1; i<=n; i++){
            w[i] = sc.next();
        }
        String ans = "Yes";
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(w[i].equals(w[j])){
                    ans = "No";
                    break;
                }
            }
        }
        for(int i=1; i<n; i++){
            int end = w[i].length()-1;
            if(w[i].charAt(end)!=w[i+1].charAt(0)){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}
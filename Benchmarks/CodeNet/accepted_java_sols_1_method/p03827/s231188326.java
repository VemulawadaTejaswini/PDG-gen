import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        String[] S = sc.next().split("");
        
        int count = 0;
        int ans = 0;
        
        for(int i=0; i<N; i++){
            if(S[i].equals("I")){
                count++;
            }
            if(S[i].equals("D")){
                count--;
            }
            
            ans = Math.max(ans, count);
        }
        
        System.out.println(ans);
    }
}
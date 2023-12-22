import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        int N=S.length();
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(S.charAt((i+j)%N)==T.charAt(j%N)){
                }else{
                    break;
                }
                if(j==N-1){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}

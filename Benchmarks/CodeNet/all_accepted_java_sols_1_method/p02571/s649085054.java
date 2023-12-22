import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        char [] app = new char[S.length()];
        char [] down = new char[T.length()];
        int [] anc = new int[S.length()-T.length()];
        int Min = 0;
        
        
        for(int i = 0;i < S.length();i++){
            app[i] = S.charAt(i);
        }
        for(int i = 0;i < T.length();i++){
            down[i] = T.charAt(i);
        }
        if(S.length() == T.length()){
            int count = 0;
            for(int i = 0;i < T.length();i++){
                if(app[i] != down[i]){
                    count++;
                }
                Min = count;
            }
        System.out.println(Min);
        }else{
            for(int i = 0;i < S.length()-T.length();i++){
                int count = 0;
                for(int l = 0;l < T.length();l++){
                    if(app[i+l] != down[l]){
                        count++;
                    }  
                    anc[i] = count;
                }
            }
            Min = anc[0];
            for(int i = 1 ; i < anc.length; i++){
                if(Min > anc[i]){
                    Min = anc[i];
                    }
                }
                System.out.println(Min);
        }
    }
}

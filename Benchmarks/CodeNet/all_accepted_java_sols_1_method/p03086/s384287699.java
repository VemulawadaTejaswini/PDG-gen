import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc. nextLine();
        
        char []str_t_char = str.toCharArray();
        char []ACGT = {'A', 'C', 'G', 'T'};
        
        int ans = 0;
        
        for (int i = 0 ; i < str_t_char.length; i++){
            int count = 0;
            for (int iter = i; iter < str_t_char.length; iter++){
                boolean flag = false;
                for (int k = 0; k < ACGT.length; k++){
                    if (str_t_char[iter] == ACGT[k]){
                        flag = true;
                        break;
                    } 
                }
                
                if (flag){
                    count++;
                    ans = Math.max(ans, count);
                }else {
                    break;
                }
            } 
        }
        System.out.println(ans);
    }
}

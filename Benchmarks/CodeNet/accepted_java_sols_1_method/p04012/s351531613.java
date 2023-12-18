import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String str[] = w.split("");
        Arrays.sort(str);
        boolean ans = true;
        int count = 1;
        for(int i = 0;i<w.length()-1;i++){
            
            if(str[i].equals(str[i+1])){
                
                count++;
                
            }else if(count%2==1){
                
                ans = false;
                break;
                
            }else{
                count = 1;
            }
        }
        if(count%2==1){
            ans = false;
        }
        if(ans) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}

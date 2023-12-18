import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String[] code_array = code.split("");
        String before = "";
        int flag = 0;
        
        for(int i = 0; i < code.length(); i++){
            
            if(i == 0){
                before = code_array[i];
                continue;
            }
            if(code_array[i].equals(before)){
                flag = 1;
            }
            before = code_array[i];
        }
        
        if(flag == 0){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
        
    }
}

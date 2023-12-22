import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
    
        String[] strArr = str.split("");
        int count = 0;
        
        for(int i = 0; i <= (str.length() - 1); i++){
            if(strArr[i].equals("1")){
                count++;
            }   
        }
        System.out.println(count);

    }
}

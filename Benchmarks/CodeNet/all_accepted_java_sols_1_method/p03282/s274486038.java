import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        
        int maxIndex = s.length();
        if(Long.parseLong(k) < s.length()){
            maxIndex = Integer.parseInt(k);
        }

        boolean isOne = true;
        int printIndex = 0;
        for(printIndex = 0; printIndex < maxIndex; printIndex++){
            if(s.charAt(printIndex) != ('1')){
                isOne = false;
                break;
            }
        }
        if(isOne){
            System.out.println("1");
        }else{
            System.out.println(s.charAt(printIndex));
        }
    }
}

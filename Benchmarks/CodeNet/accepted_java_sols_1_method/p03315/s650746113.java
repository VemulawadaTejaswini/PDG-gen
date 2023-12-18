import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        String S=scanner.next();
        int result=0;
        for(int i=0;i<4;i++){
            char c=S.charAt(i);
            if(c=='+'){
                result++;
            }else{
                result--;
            }
        }
        System.out.println(result);
    }
}

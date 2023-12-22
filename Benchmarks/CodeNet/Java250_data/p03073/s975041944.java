import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(s.charAt(i) == '0'){
                    count++;
                }
            }else{
                if(s.charAt(i) == '1'){
                    count++;
                }
            }
        }
        
        if(count > (s.length() / 2)){
            count = s.length() - count;
        }
        
        System.out.println(count);
    }
}
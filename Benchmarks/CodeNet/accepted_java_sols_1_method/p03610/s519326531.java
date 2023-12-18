import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if(i < s.length() - 2){
                    System.out.print(c[i]);
                }else{
                    System.out.println(c[i]);
                }
            }
        }
    }
}

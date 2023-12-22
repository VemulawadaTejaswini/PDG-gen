import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        boolean yes = true;
        if(s.length() % 2 != 0){
            yes = false;
        }else{
            for(int i = 0; i < s.length(); i++){
                if(i%2 == 0){
                    if(s.charAt(i) != 'h'){
                        yes = false;
                    }
                }else{
                    if(s.charAt(i) != 'i'){
                        yes = false;
                    }
                }
            }
        }
        if(yes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
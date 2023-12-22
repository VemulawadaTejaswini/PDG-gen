import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String SA = sc.nextLine();
        String SB = sc.nextLine();
        String SC = sc.nextLine();
        char next = 'a';
        int a = 0;
        int b = 0;
        int c = 0;
        while(true) {
            if(next == 'a'){
                if(a == SA.length()){
                    System.out.println("A");
                    break;
                }else{
                    next = SA.charAt(a);
                    a++;
                }
            }else if(next == 'b'){
                 if(b == SB.length()){
                    System.out.println("B");
                    break;
                }else{
                    next = SB.charAt(b);
                    b++;
                }
            }else{
                 if(c == SC.length()){
                    System.out.println("C");
                    break;
                }else{
                    next = SC.charAt(c);
                    c++;
                }
            }
        }
    }
}

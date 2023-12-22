import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int Ccount = 0;
        if(s.charAt(0) != 'A'){
            System.out.println("WA");
            System.exit(0);
        }
        for(int i = 1; i < s.length(); i++){
            if(i >= 2 && i < s.length() - 1){
                char c = s.charAt(i);
                if(c == 'C')Ccount++;
                else if(c >= 'A' && c <='Z'){
                    System.out.println("WA");
                    System.exit(0);
                }
            }
            else {
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    System.out.println("WA");
                    System.exit(0);
                }
            }
        }
        if(Ccount == 1)System.out.println("AC");
        else System.out.println("WA");
        return;
    }
}                                                                    
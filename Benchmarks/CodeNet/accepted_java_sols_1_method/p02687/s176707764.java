import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        String S=stdIn.next();
        String B="ABC";
        String R="ARC";

        if(S.equals(B)){
            System.out.println(R);
            
        }
        else if(S.equals(R)){
            System.out.println(B);
            
        }
        
        
    }

}
import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        String S = SC.next();

        if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}

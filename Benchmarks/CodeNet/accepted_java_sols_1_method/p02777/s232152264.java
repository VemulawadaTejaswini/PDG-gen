import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        String U = scanner.next();

        if(U.equals(S)){
            A--;
        } else if(U.equals(T)){
            B--;
        }

        System.out.println(A + " " + B);
    }
}

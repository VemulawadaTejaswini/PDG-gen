import java.util.*;
 
 
class Main {
    static int abc[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if(N%2==1) {
            System.out.println("No");
            return;
        }
        String S = sc.next();

        String str = S.substring(0,N/2);

        str = str + str;

        if(str.equals(S)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
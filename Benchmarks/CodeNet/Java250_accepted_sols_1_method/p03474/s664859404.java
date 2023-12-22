import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String[] ary = sc.next().split("");
        if(!ary[A].equals("-")){
            System.out.println("No");
            System.exit(0);
        }else if(ary.length != (A + B + 1)){
            System.out.println("No");
            System.exit(0);
        }
        for(int i = 0; i < ary.length; i++){
            if(i != A){
                if(!ary[i].matches("[0-9]")){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}
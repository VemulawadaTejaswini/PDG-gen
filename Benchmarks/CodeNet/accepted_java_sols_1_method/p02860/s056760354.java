import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        if(n%2 != 0){
            System.out.println("No");
        }else if(s.subSequence(0, n/2).equals(s.substring(n/2))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
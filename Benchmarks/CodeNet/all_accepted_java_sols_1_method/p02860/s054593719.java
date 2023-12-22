import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        //System.out.println(s.substring(0,n/2));
        //System.out.println(s.substring(n/2 , n));
        if(s.substring(0,n/2).equals(s.substring(n/2 , n))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }        
    }
}
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String line1 = sc.next();
        String line2 = sc.next();
        
        if(line1.charAt(0) == line2.charAt(2) &&
           line1.charAt(1) == line2.charAt(1) &&
           line1.charAt(2) == line2.charAt(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
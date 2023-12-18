import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();
        
        str += str;
        if(str.contains(pattern)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

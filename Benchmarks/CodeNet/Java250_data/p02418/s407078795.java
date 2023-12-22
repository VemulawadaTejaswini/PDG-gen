import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();
        text+=text;
        String pat = sc.nextLine();
         if (text.contains(pat)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

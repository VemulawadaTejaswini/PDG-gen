import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String pattern = input.nextLine();
        word += word;
        if(word.contains(pattern))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

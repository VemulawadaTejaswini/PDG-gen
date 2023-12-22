import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();
        if(X%(Y+Z) >= Z){
            System.out.println(X/(Y+Z));
        }
        else{
            System.out.println(X/(Y+Z)-1);
        }
    }
}
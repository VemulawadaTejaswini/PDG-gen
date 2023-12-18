import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Boolean flag = false;
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        char[] Narray = N.toCharArray();
        for(char ln :Narray){
            if(ln == '7'){
                System.out.println("Yes");
                flag = true;
                break;
            }
        }
        if(flag == false)
            System.out.println("No");
    }
}
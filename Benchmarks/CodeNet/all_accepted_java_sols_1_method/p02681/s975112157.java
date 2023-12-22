import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String oldStr = input.next();
        String newStr = input.next();
        boolean flag = false;
        if(newStr.length()-oldStr.length()==1){
            if(newStr.substring(0,newStr.length()-1).equals(oldStr)){
                flag = true;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
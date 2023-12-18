import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            str = str.replaceAll("apple","------");
            str = str.replaceAll("peach","apple");
            str = str.replaceAll("------","peach");
            System.out.println(str);
        }
    }
}
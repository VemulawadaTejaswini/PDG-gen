import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.startsWith("YAKI")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

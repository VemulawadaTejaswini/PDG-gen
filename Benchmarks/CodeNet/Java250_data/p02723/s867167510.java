import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        if(array[2] == array[3] && array[4] == array[5]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
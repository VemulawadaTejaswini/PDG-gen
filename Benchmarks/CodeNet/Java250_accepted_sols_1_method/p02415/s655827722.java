import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split("");
        for(String t : text){
            if(t.matches("[a-z]")){
                System.out.print(t.toUpperCase());
            }else{
                System.out.print(t.toLowerCase());
            }
        }
        System.out.println();

        scanner.close();
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String w = scanner.nextLine();
        StringBuilder t = new StringBuilder();

        while(true){
            String input = scanner.nextLine();

            if(input.equals("END_OF_TEXT")){
                break;
            }

            t.append(input);
            t.append(" ");
        }

        String text = t.toString().toLowerCase();
        String[] textArray = text.split("\\s+");
        int count = 0;
        for(String txt : textArray){
            if(txt.equals(w)){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}


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

        String text = t.toString();
        if(text.contains(w)){
            int index = text.indexOf(w) + 1, count = 0;
            while(index != 0){
                index = text.indexOf(w , index) + 1;
                count++;
            }
            System.out.println(count);
        }else{
            System.out.println(0);
        }
        scanner.close();
    }
}


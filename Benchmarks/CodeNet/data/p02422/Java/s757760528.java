import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scanner.nextLine());
        int q = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < q; i++){
            String command = scanner.next();
            if(command.equals("replace")){
                int start = Integer.parseInt(scanner.next());
                int end = Integer.parseInt(scanner.next()) + 1;
                String text = scanner.next();
                str.replace(start, end, text);
            }else if(command.equals("reverse")){
                int start = Integer.parseInt(scanner.next());
                int end = Integer.parseInt(scanner.next()) + 1;
                StringBuilder sub = new StringBuilder(str.substring(start, end));
                sub.reverse();
                str.replace(start, end, sub.toString());

            }else if(command.equals("print")){
                int start = Integer.parseInt(scanner.next());
                int end = Integer.parseInt(scanner.next()) + 1;
                System.out.println(str.substring(start, end));
            }
        }

        scanner.close();
    }
}


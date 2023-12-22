import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = 0;
        while(true){
            String in = scanner.nextLine();
            StringBuilder m = new StringBuilder(in);

            if(m.toString().equals("-")){
                break;
            }

            for(int i = Integer.parseInt(scanner.nextLine()); i > 0; i--){
                h = Integer.parseInt(scanner.nextLine());
                String sub = m.substring(0, h);
                m.delete(0, h);
                m.append(sub);
            }
            System.out.println(m.toString());
        }

        scanner.close();
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String msg = scanner.nextLine();
        while(!msg.equals("-")){
            int cnt = Integer.parseInt(scanner.nextLine());
            for(int i=0; i<cnt; i++){
                int h = Integer.parseInt(scanner.nextLine());
                String h1 = msg.substring(0,h);
                String h2 = msg.substring(h);
                msg = h2 + h1;
            }
            System.out.println(msg);
            msg = scanner.nextLine();
        }
    }
}

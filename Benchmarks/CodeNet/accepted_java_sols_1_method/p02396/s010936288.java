import java.util.Scanner;
 
class Main {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
  
        int i = 0;
        while (true) {
            i++;
            int x = scanner.nextInt();
            if(x == 0) {
                break;                                              
            }
            sb.append("Case").append(" ").append(i + ":").append(" ").append(x).append("\n");

        }  
            System.out.print(sb);
            sb.setLength(0);
    }
}
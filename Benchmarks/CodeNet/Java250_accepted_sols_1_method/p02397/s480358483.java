import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            int x = scan.nextInt();
            int y = scan.nextInt();

            int[] sort = {x,y};
            Arrays.sort(sort);

            if(x == 0 && y == 0) {
                break;
            }
            sb.append(sort[0]).append(" ").append(sort[1]).append("\n");
        }
        System.out.print(sb);
    }
}
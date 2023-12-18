import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String snake = sc.next();
            if (snake.indexOf('#') > 0 && snake.charAt(0) == '>' && snake.charAt(1) == '\'' && snake.charAt(snake.length() - 1) == '~') {
                int count=0;
                for(int i=2,j=snake.length()/2+1;i<snake.length()/2;i++,j++) {
                    if(snake.charAt(i)=='='&&snake.charAt(j)=='=') {
                        count+=2;
                    }
                }
                if(count==snake.length()-4) {
                    System.out.println("A");
                }else {
                    System.out.println("NA");
                }
            } else if (snake.charAt(0) == '>' && snake.charAt(1) == '^' && snake.charAt(snake.length() - 2) == '~' && snake.charAt(snake.length() - 1) == '~' && snake.replaceAll("Q=", "").equals(">^~~")) {
                System.out.println("B");
            } else {
                System.out.println("NA");
            }
        }
    }
}


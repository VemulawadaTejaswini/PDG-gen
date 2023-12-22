import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            int i = 1;
            int num = scanner.nextInt();
            while(num != 0){
                System.out.println("Case"+" "+i+":"+" "+num);
                i++;
                num = scanner.nextInt();
            }

            }finally{
                scanner.close();
            }
        }
    }

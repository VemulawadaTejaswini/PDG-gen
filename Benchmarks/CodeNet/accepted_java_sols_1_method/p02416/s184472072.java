import java.util.Scanner;

public class Main{
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        String s = scanner.next();
        int S = 0;
        while(!s.equals("0")){
            S = 0;
            for(int i = 0; i < s.length(); i++)
                S += Character.getNumericValue((int)s.charAt(i));
            System.out.println(S);
            s = scanner.next();
        }
    }
}


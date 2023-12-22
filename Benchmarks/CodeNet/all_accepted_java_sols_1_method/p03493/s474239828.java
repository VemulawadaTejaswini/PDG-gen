import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int x = 0;

        for(int i = 0; i < 3; i++){
            if(s.charAt(i) == '1') x++;
        }

        System.out.println(x);

        sc.close();
    }
}
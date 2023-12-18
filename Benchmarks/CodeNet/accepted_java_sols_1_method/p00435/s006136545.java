import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            for(int j = 0; j < 3; j++){
                if(a == 'A'){
                    a = 'Z';
                }else{
                    a = (char)(a-1);
                }
            }
            System.out.print(a);
        }

        System.out.println();

    }

}

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        String str;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        str = scanner.next();

        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        char c3 = str.charAt(2);

        if(c1 == '1') {
            sum++;
        } 

        if(c2 == '1') {
            sum++;
        } 

        if(c3 == '1') {
            sum++;
        } 


        
        System.out.println(sum);

        scanner.close() ;
    }
}

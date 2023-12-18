import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        char[] chr = {input.charAt(0), input.charAt(1), input.charAt(2)};
        if(chr[0]!=chr[1] || chr[0]!=chr[2] || chr[1]!=chr[2]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
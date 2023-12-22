import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int dmy = scan.nextInt();
        int index = scan.nextInt() - 1;
        char[] input = scan.next().toCharArray();
        switch(input[index]){
            case 'A':
                input[index] = 'a';
                break;
            case 'B':
                input[index] = 'b';
                break;
            case 'C':
                input[index] = 'c';
                break;
        }

        // answer
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");


    }
}
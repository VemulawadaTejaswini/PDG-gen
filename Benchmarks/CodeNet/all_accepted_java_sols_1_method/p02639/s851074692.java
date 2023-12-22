import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        String[] x = input.split(" ");
        for(int i = 0 ; i < x.length ; i++){
            if(x[i].equals("0")){
                System.out.println(i + 1);
            }
        }
    }
}

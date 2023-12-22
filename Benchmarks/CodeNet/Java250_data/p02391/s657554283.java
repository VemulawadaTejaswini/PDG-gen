import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int inputnum = Integer.parseInt(line[0]);
            int inputnum2 = Integer.parseInt(line[1]);
            if(inputnum == inputnum2){
                System.out.println("a == b");
            }
            else if(inputnum < inputnum2){
                System.out.println("a < b"); 
            }
            else {
                System.out.println("a > b");
            }
        }
    }
}
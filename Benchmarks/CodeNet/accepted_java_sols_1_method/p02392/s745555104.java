import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int inputnum = Integer.parseInt(line[0]);
            int inputnum2 = Integer.parseInt(line[1]);
            int inputnum3 = Integer.parseInt(line[2]);
            if(inputnum < inputnum2 ){
                if(inputnum2 < inputnum3){
                    System.out.println("Yes");    
                }
                else {
                    System.out.println("No");    
                }
            }
            else {
                System.out.println("No");    
            }
        }
    }
}
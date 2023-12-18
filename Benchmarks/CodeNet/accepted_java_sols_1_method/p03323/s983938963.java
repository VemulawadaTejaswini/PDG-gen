import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            int A = input.nextInt();
            int B = input.nextInt();
           
            if(Math.max(A,B) > 8){
                System.out.println(":(");
            } else {
                System.out.println("Yay!");
            }
        }
    }
}
        
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
             int round = input.nextInt();
 
             if(round > 999){
                 System.out.println("ABD");
             } else {
                 System.out.println("ABC");
             }
        }
    }
}
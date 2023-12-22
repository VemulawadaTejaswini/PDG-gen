import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();

        if("Sunny".equals(S)){
            System.out.print("Cloudy");
        }else if("Cloudy".equals(S)){
            System.out.print("Rainy");
        }else{
            System.out.print("Sunny");
        }

        




        }
    }

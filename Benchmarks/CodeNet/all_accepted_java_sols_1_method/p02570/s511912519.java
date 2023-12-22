import java.util.*;

class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double D = scan.nextInt();
        double T = scan.nextInt();
        double S = scan.nextInt();
        if((D/S)<=T){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
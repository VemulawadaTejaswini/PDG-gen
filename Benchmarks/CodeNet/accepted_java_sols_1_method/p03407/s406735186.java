import java.util.Scanner;
class Main{
    public static void main(String args[]){
    
        Scanner scan = new Scanner(System.in);

        int coinA = scan.nextInt();

        int coinB = scan.nextInt();


        int coinC = scan.nextInt();



  
        if (coinA + coinB  >= coinC ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    

    }
}
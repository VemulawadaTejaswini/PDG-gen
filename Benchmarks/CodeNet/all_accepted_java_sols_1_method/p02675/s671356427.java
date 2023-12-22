import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
       
        int ones = N % 10;

        if(ones == 2 || ones == 4 || ones == 5 || ones == 7 || ones == 9 ){
            System.out.println("hon");
        }
        else if(ones == 0 || ones == 1 || ones == 6 || ones == 8){
            System.out.println("pon");
        }else if(ones == 3){
            System.out.println("bon");
        }
        sc.close();
     
    }
    
}
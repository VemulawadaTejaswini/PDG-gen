import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            int age = scanner.nextInt();
            int adultPrice = scanner.nextInt();
            int finalPrice = -1;
            if(age<6) finalPrice = 0;
            else if(age<13) finalPrice = adultPrice/2;
            else finalPrice = adultPrice;
            System.out.println(finalPrice);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}

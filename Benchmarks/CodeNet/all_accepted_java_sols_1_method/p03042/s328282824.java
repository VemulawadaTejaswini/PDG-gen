import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        scan.close();
        String mae = str1.substring(0,2);
        String ushiro = str1.substring(2,4);
        int maei = Integer.parseInt(mae);
        int ushiroi = Integer.parseInt(ushiro);
        if((1 <= maei && maei <= 12) && (1 <= ushiroi && ushiroi <= 12)){
            System.out.println("AMBIGUOUS");
        }else if(1 <= maei && maei <= 12){
            System.out.println("MMYY");
        }else if(1 <= ushiroi && ushiroi <= 12){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }



        }}
import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int dif = -2000000000;
        int min = Integer.parseInt(scan.nextLine());
        int number;
        for(int i=1; i<n; i++){
            number = Integer.parseInt(scan.nextLine());
            dif = Math.max(dif, number-min);
            min = Math.min(min, number);
        }
        
        System.out.println(dif);
    }
    
}
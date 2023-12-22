import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        if (1 <= S / 100 && S / 100 <= 12) {
            if (1 <= S % 100 && S % 100 <= 12) {
                System.out.println("AMBIGUOUS");
            } else {
                System.out.println("MMYY");
            }
        } else {
            if(1 <= S % 100 && S % 100 <= 12){
                System.out.println("YYMM");
            }else{
                System.out.println("NA");
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        String First = S.substring(0, 2);
        String Second = S.substring(2, 4);

        int first = Integer.parseInt(First);
        int second = Integer.parseInt(Second);

        boolean yymm = false;
        boolean mmyy = false;

        if(0 <= first && first <= 99 && 1 <= second && second <= 12){
            yymm = true;
        }

        if(0 <= second && second <= 99 && 1 <= first && first <= 12){
            mmyy = true;
        }

        if(yymm && !mmyy){
            System.out.println("YYMM");
        }else if(!yymm && mmyy){
            System.out.println("MMYY");
        }else if(!yymm && !mmyy){
            System.out.println("NA");
        }else{
            System.out.println("AMBIGUOUS");
        }

    }
}

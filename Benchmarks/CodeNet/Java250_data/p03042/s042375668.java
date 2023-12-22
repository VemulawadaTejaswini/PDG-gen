import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int first = input / 100;
        int latter = input % 100;

        boolean firstMonth = first > 0 && first <= 12;
        boolean latterMonth = latter > 0 && latter <= 12;
        if(firstMonth && latterMonth)System.out.println("AMBIGUOUS");
        else if(firstMonth)System.out.println("MMYY");
        else if(latterMonth)System.out.println("YYMM");
        else System.out.println("NA");
    }
}
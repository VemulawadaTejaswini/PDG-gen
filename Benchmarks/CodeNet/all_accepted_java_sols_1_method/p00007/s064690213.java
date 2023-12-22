import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int debt = 100000;
        int day = in.nextInt();
        for(int i = 0; i < day; i++){
            debt = (debt * 105 / 100 + 999) / 1000 * 1000;
        }
        System.out.println(debt);
    }
}
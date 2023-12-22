import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.nextLine();
        //sc.close();
        String[] n  = str.split(" ");
        int a = Integer.parseInt(n[0]);
        int b = Integer.parseInt(n[1]);
        int fee = 0;
        if( a <= 5 ){
            fee = 0;
        } else if ( a >= 6 && a <= 12){
            fee = b / 2;
        } else {
            fee = b;
        }
        System.out.println(fee);
    } 
}  
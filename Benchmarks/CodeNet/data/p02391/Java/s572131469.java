import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        String judge = "";
        if(a > b){ judge = "a > b"; }
        else if(a < b){ judge = "a < b"; }
        else{ judge = "a == b"; }
        System.out.println(judge);
    }
}

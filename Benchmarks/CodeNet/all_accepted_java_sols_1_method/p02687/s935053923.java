import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str =sc.next();

        if(str.equals("ABC") ){
            System.out.println("ARC");
        }
        else if(str.equals("ARC")){
            System.out.println("ABC");
        }
    }
}
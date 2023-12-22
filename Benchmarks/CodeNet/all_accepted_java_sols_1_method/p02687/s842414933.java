import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        if(a.equals("ABC")){
            System.out.println("ARC");
        }
        if(a.equals("ARC")){
            System.out.println("ABC");
        }
    }

}
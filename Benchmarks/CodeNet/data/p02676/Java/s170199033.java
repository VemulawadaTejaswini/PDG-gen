import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String a = scan.next();
        int b = a.length();
        if(b <= num){
            System.out.println(a);
        }else{
            System.out.println(a.substring(0,num) + "...");
        }


        
    }
}
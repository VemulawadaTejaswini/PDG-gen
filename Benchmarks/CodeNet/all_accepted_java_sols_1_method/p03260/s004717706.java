import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a%2==0||b%2==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
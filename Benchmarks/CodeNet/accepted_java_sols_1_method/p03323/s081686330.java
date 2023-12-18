import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int E =scn.nextInt();
        int S=scn.nextInt();
        if(E>8||S>8){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}

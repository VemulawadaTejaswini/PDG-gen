import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int front=scn.nextInt();
        System.out.println(n+1-front);
    }
}

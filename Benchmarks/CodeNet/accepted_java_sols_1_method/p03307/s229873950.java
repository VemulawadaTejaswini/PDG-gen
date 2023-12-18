import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        if(n%2==0){
            System.out.println(n);
        }else{
            System.out.println(n*2);
        }
    }
}
import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ex = n%k;
        if(ex==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}

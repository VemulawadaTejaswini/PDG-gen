import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int differ = b-a;
        int aLength = 0;
        for(int i=1;i<differ;i++){
            aLength+=i;
        }
        System.out.println(aLength-a);
    }
}

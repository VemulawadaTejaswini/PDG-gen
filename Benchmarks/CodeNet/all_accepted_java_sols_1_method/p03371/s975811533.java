import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ab = scn.nextInt();  
        int aNum = scn.nextInt();
        int bNum = scn.nextInt();
        int aTotal  = aNum*a;
        int bTotal = bNum*b;
        int abUp = 0;
        int abDown = 0;
        if(aNum>bNum){
            abUp = aNum*ab*2;
            abDown = bNum*ab*2+a*(aNum-bNum);
        }else{
            abUp = bNum*ab*2;
            abDown = aNum*ab*2+b*(bNum-aNum);
        }
        int min = aTotal+bTotal;
        min = Math.min(min,abUp);
        min = Math.min(min,abDown);
        System.out.println(min);
    }
}
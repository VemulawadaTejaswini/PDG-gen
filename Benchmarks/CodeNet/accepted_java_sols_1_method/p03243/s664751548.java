import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String n=scn.next();
        int num=Integer.parseInt(n);
        while(true){
            if(n.charAt(0)==n.charAt(1)&&n.charAt(1)==n.charAt(2)){
                break;
            }
            num++;
            n=String.valueOf(num);
        }
        System.out.println(n);
    }
}
import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        String answer = "ABC";
        if(n>999) answer="ABD";
        System.out.println(answer);
    }
}

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        String answer = "Odd";
        if(a%2==0||b%2==0) answer = "Even";
        System.out.println(answer);
    }
}

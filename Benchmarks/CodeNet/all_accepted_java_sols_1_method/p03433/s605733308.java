import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int a =scn.nextInt();
        String answer ="No";
        if(a>=n%500) answer="Yes";
        System.out.println(answer);
    }
}

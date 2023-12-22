import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String n=scn.next();
        scn.close();
        int cnt=0;
        String answer="No";
        if(n.charAt(1)==n.charAt(2)&&(n.charAt(0)==n.charAt(1)||n.charAt(3)==n.charAt(1))) answer = "Yes";
        System.out.println(answer);
    }
}
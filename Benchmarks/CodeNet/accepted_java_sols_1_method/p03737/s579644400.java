import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String[] s1 = stdIn.next().split("");
        String[] s2 = stdIn.next().split("");
        String[] s3 = stdIn.next().split("");

        System.out.println(s1[0].toUpperCase()+s2[0].toUpperCase()+s3[0].toUpperCase());


    }
}

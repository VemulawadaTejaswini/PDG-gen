import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adder = 0;
        int counter=0;
        Scanner scan = new Scanner(System.in);

        int hako[] = new int[3];
        for (int i = 0; i < 3; i++) {
            hako[i]=scan.nextInt();
        }
        int hako1[]=new int[3];
        hako1[0]=hako[1];
        hako1[1]=hako[0];
        hako1[2]=hako[2];
        int hako2[]=new int[3];
        hako2[0]=hako1[2];
        hako2[1]=hako1[1];
        hako2[2]=hako1[0];
        System.out.print(hako2[0]+" ");
        System.out.print(hako2[1]+" ");
        System.out.print(hako2[2]+" ");
        }


}
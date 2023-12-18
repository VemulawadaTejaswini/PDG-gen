import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int N=sc.nextInt();
        int[] numbers=new int[3];
        for(int i=0; i<3; i++) {
            numbers[i]=sc.nextInt();
        }
        sc.close();
        int area =numbers[0] * numbers[1]/2;
        System.out.println(area);
    }
}
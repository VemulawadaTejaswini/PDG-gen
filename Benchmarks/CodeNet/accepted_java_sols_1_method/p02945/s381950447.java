import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Max =-301;
        int Math = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        Math = A + B;
        Max = Math;
        Math = A - B;
        	if(Math > Max)
        		Max = Math;
        Math = A * B;
        	if(Math > Max)
        		Max = Math;
        System.out.println(Max);
        sc.close();
    }
}
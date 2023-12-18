import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.nextLine();
        //sc.close();
        String[] a  = str.split(" ");
        int A = Integer.parseInt(a[0]);
        int P = Integer.parseInt(a[1]);

        int ap = ( ( A * 3 ) + P )/ 2;
    
        System.out.println(ap);
    } 
}   
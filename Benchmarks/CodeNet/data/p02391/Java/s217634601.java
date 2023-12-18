import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        //numAとnumBの大小比較
        if(numA>numB)
        System.out.println("a > b");
        else if(numA<numB)
        System.out.println("a < b");
        else if(numA==numB)
        System.out.println("a == b");
    }
}


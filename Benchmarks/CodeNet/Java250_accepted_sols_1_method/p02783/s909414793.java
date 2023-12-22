import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int H = str.nextInt();
        int A = str.nextInt();

        if(H % A == 0){
            System.out.println(H / A);
        }
        else{
            System.out.println(H / A + 1);
        }

        str.close();
    }
}
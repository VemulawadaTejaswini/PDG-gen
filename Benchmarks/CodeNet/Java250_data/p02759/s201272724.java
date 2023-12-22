import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kotae=0;int Ancer=0;
        int num = scan.nextInt();
        kotae=num/2;
        if(num%2==0){
            Ancer=kotae;
        }
        if(num%2==1){
            Ancer=kotae+1;
        }
    System.out.println(Ancer);
    }

}

import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int val1=scan.nextInt();
                int val2=scan.nextInt();
                int val3=scan.nextInt();
                if(val1<val2&&val2<val3){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}
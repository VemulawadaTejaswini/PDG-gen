import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int val1=scan.nextInt();
                int val2=scan.nextInt();
                if(val1<val2){
                        System.out.println(val1+" < "+val2);
                }else if(val1>val2){
                        System.out.println(val1+" > "+val2);
                }else if(val1==val2){
                        System.out.println(val1+" == "+val2);
                }
        }
}
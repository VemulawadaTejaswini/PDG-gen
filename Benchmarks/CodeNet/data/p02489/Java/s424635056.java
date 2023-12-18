import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                for(int i=1; i<=100; i++){
                        int val = scan.nextInt();
                        if(val==0) break;
                        System.out.println("Case " + i + ": " + val);
                }
        }
}
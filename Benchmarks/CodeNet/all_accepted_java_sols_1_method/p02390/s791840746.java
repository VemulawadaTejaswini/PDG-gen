import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan =new Scanner(System.in);
                int val=scan.nextInt();
                int h=val/3600;
                int m=(val-h*3600)/60;
                int s=val%60;
                System.out.println(h+":"+m+":"+s);
        }
}
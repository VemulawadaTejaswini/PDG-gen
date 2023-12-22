import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int val1=scan.nextInt();
                int val2=scan.nextInt();
                int val3=scan.nextInt();
                int count=0;
                for(int i=val1;i<=val2;i++){
                        if(val3%i==0){
                                count++;
                        }
                }
                System.out.println(count);
        }
}
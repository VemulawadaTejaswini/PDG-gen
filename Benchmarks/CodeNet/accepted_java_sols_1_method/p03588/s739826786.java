
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scn=new Scanner(System.in);
                int max=0;
                int value=0;
                int a=0;
                int b=0;
                int N=scn.nextInt();
                for(int i=0;i<N;i++){
                        a=scn.nextInt();
                        b=scn.nextInt();
                        if(max<a){
                                max=a;
                                value=b;
                        }
                }
                System.out.println(max+value);
        }
}
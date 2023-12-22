import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x,y;
        int tmp;
        while(true){
            x=scan.nextInt();
            y=scan.nextInt();
            if(x==0&&y==0)System.exit(0);
            if(x>y){
                tmp=x;
                x=y;
                y=tmp;
            }
            System.out.println(x+" "+y);
        }
   }
}

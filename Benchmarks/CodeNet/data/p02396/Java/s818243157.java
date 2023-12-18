import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int x;
        int i=1;
        while((x=scan.nextInt())!=0){
            System.out.println("Case "+i+": "+x);
            i++;
        }
   }
}

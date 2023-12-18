import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int low = scan.nextInt();
        int high = scan.nextInt();
        int i;
        int a = 0;
        for( i = 1;i < 1000; i ++){
            a = num * i;
            if(low <= a && a <= high ){
                //System.out.println("OK");
                //System.out.println(i);
                break;
            }
        }
        if(low <= a && a <= high){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }

}
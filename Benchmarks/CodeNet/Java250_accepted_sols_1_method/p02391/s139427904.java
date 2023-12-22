import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input a.");
        int a = sc.nextInt();
//        System.out.println("Please input b.");
        int b = sc.nextInt();
        if((a<-1000 || 1000<a) || (b<-1000 || 1000<b)){
            System.exit(-1);
        }else if(a<b){
            System.out.println("a < b");
        }else if(a>b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
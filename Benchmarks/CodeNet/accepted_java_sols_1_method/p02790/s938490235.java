import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        scan.close();


        if(a < b){
            for(int i = 0; i < b; i++){
                System.out.print(a);
            }
            
        }else{
            for(int i = 0; i < a; i++){
                System.out.print(b);
            }
        }
    }
}

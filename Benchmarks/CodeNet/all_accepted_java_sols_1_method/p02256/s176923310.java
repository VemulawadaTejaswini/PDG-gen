import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x;
            int y;
            
            if(a > b){
                x = a;
                y = b;
            }else{
                x = b;
                y = a;
            }

            int tmp;
            while((tmp = x % y) != 0){
                x = y;
                y = tmp;
            }
            System.out.println(y);
            sc.close();
    }   
}

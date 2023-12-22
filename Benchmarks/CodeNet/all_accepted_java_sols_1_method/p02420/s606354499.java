import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(;;){
            String s=scan.next();
            if(s.equals("-")){
                break;
            }
            int m=scan.nextInt();

            for(int i=0;i<m;i++){
                int n=scan.nextInt();
                s=s.substring(n)+s.substring(0,n);
            }
            System.out.println(s);
        }
    }
}


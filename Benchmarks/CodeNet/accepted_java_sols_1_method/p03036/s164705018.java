import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            int r = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int xN = x;
            for(int i=0;i<10;i++){
                xN =r*xN -d ;
                System.out.println(xN);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}

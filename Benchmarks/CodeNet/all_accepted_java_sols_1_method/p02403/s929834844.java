import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if(x==0 && y ==0) break;
            
            for (int i=1;i<=x;i++) {
                for (int j=1;j<=y;j++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

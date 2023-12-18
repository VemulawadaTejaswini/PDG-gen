import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int x,y;
        
        while(true){
            y = scan.nextInt();
            x = scan.nextInt();
            
            if(x == 0 && y == 0){
                break;
            }
            for(int j = 0; j < y;j++){
                for(int i = 0;i < x;i++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

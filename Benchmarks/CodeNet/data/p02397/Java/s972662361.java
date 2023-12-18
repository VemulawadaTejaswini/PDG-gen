import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z;
        
                
        
        while (x+y>0) {
            if(x>y){
                z=x;
                x=y;
                y=z;   
        }

        System.out.println(x+" "+y);
        x = scan.nextInt();
        y = scan.nextInt();
       
    }
}
}

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int x,i=0;
        
        Scanner scan = new Scanner(System.in);
        
        while(i<10000){
            i++;
            x = scan.nextInt();
            
            if(x == 0){
                break;
            }else {
                System.out.println("Case "+i+": "+x);
            }
            
        }
    }
}

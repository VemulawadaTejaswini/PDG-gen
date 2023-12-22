import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt(); //羊
        int y=stdIn.nextInt(); //狼

        if(x>y){
            System.out.println("safe");
            
        }
        else{
            System.out.println("unsafe");
            
        }
        
    }

}
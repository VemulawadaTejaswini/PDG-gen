import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int k=stdIn.nextInt();

        int x=stdIn.nextInt();
        int y=stdIn.nextInt();
        int count=0;
        for(int i=x; i<=y; i++){
            if(i%k==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("OK");
            
        }
        else{
            System.out.println("NG");
            
        }
        
        
    }

}
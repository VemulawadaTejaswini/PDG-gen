import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=5;
         int i=1;
        while(x!=0){
          
            x= scanner .nextInt();
            if(x==0){
                break;
            }
            System.out.println("Case "+i+": "+x);
              i++;
            
        }
    }

}
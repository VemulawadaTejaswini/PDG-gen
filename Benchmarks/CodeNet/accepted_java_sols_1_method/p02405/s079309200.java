import java.util.Scanner;

public class Main{
    public static void main(final String[] args){

        final Scanner scanner = new Scanner(System.in);

        while(true){
           int h = scanner.nextInt();
           int w = scanner.nextInt();
        if(h == 0 && w == 0){
            break;
        }
        for(int i=1;i<=h;i++){
            if(i % 2 == 1){
                for(int j=1;j<=w;j++){
                    if(j % 2 == 1){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                    if(j == w){
                        System.out.println();
                        
                        
                    }
                }
               }else{
                      for(int j=1;j<=w;j++){

                        if(j % 2 == 0){
                        System.out.print("#");
                    }else{
                        System.out.print(".");
                    }
                    if(j == w){
                        System.out.println();
                        
                    }
                }

                    }

            }
                System.out.println();
        }
     
    }
        
   
    }

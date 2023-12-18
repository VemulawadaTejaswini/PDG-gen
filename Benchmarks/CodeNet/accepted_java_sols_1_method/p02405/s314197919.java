import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int w = 0;
        int h = 0;
        int i = 0;
        int g = 0;
        
        while(true){
            
            h = scan.nextInt();
            w = scan.nextInt();
            
            if(h == 0 & w == 0){
                
                break;
                
            }
            
            else if(w%2 == 0){
                
                for(i = 1; i<=h; i++){
                    if(i%2 == 1){
                    
                        for(g = 1; g<=w; g++){
                            if(g%2 == 1){
                                System.out.print("#");
                            }
                            else if(g%2 == 0 & !(g == w)){
                                System.out.print(".");
                            }
                            else if(g == w){
                                System.out.println(".");
                            }
                        }
                    }
                    
                    if(i%2 == 0){
                    
                        for(g = 1; g<=w; g++){
                            if(g%2 == 1){
                                System.out.print(".");
                            }
                            else if(g%2 == 0 & !(g == w)){
                                System.out.print("#");
                            }
                            else if(g == w){
                                System.out.println("#");
                            }
                        }
                    }
                  
                }
            
            }
            //
            else if(w%2 == 1)
            {
               
                for(i = 1; i<=h; i++)
                {
                    if(i%2 == 1)
                    {
                    
                        for(g = 1; g<=w; g++)
                        {
                            if(g%2 == 1 & !(g == w))
                            {
                                System.out.print("#");
                            }
                            else if(g%2 == 0)
                            {
                                System.out.print(".");
                            }
                            else if(g == w)
                            {
                                System.out.println("#");
                            }
                        }
                    }
                    
                    if(i%2 == 0){
                    
                        for(g = 1; g<=w; g++){
                            if(g%2 == 1 & !(g == w)){
                                System.out.print(".");
                            }
                            else if(g%2 == 0){
                                System.out.print("#");
                            }
                            else if(g == w){
                                System.out.println(".");
                            }
                        }
                    }
                }
            
            }
           System.out.println(); 
        }
    }
}

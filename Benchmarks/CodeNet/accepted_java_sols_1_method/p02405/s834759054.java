import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int w, h;
       
        Scanner sc = new Scanner(System.in);
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            
        if(w==0 && h==0){
        break;
        }
        else{
            for(int j = 0; j<h; j++){
        for (int i = 0; i<w; i++){
            if(j%2 == 0){
                if(i!=w-1 && i%2!=1){
        System.out.print("#.");
        i++;}
       else{
        System.out.print("#");}
        
        }
            else{
                if(i!=w-1 && i%2!=1){
            System.out.print(".#");
            i++;}
            else{
            System.out.print(".");
            }
            }
       
        
        }
              System.out.println();
            }
            System.out.println();
        }
        }
}}


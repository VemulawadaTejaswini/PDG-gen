import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10001;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h==0 && w==0){
                break;
            } else {
               for(int j=0;j<h;j++){
                   for(int k=0;k<w;k++){
                    if(j==0||j==(h-1)||k==0||k==(w-1)){
                        System.out.print("#");   
                    } else {
                        System.out.print(".");
                    }
                   }
                   System.out.println();
               }
               System.out.println(); 
            }
        }
        
        sc.close();
      }
}

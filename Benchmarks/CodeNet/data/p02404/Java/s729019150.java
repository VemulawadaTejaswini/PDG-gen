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
            if(i ==0 || i == w-1 ||j ==0|| j==h-1){
        System.out.print("#");
        }
        else{
                System.out.print(".");
            }}
        System.out.println();
            }
            System.out.println();
        }
        }
}}

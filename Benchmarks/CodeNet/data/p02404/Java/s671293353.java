import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if( h==0 && w==0 ) break;
            for(int i=0;i<h;i++){
                if(i==0||i==h-1){
                for(int j=0;j<w;j++){
                    System.out.print("#");
                }
                }else{
                        System.out.print("#");
                        for(int j=0;j<w-2;j++){
                            System.out.print(".");
                        }
                            System.out.print("#");
                        
                    }
                        System.out.println("");
                    }
                    System.out.println();
                }
    }
}
    

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();

            if(h==0 && w==0){
                break;
            }else{
                for(int i = 0;i<h;i++){
                    System.out.printf("#");
                    for(int j = 0;j<w-2;j++){
                        if(i==0 || i==h-1){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("#");
                }
            }
            System.out.println();
        }
    }
}

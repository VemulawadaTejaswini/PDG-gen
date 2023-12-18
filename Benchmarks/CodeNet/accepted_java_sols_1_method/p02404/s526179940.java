import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0){
                break;
            }else{
                if(x < 3 || y < 3){
                for(int i=0;i<x;i++){
                    for(int j=0;j<y;j++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
                System.out.println();
                }else{
                    for(int l=0;l<y;l++) System.out.print("#");
                    System.out.println();                    
                    for(int i=1;i<x-1;i++){
                        System.out.print("#");
                        for(int j=1;j<y-1;j++){
                            System.out.print(".");
                        }
                        System.out.println("#");
                    }
                    for(int l=0;l<y;l++) System.out.print("#");
                    System.out.println();
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}

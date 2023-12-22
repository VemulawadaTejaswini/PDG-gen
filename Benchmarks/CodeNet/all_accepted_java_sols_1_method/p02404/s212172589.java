import java.util.*;

class Main {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h,w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();

            if(h == 0 && w == 0)    break;
            for(int i = 0;i < h;i++){
                if(i == 0 || i == h - 1){
                    for(int j = 0;j < w;j++){
                        System.out.print("#");
                    }
                    System.out.print("\n");
                }
                else{
                    for(int j = 0;j < w;j++){
                        if(j == 0 || j == w - 1)    System.out.print("#");
                        else    System.out.print(".");
                    }
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
        }
    }
}


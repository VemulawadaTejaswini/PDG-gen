import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int H,W,i,j;
        while(true){	
            H = input.nextInt();	
            W = input.nextInt();	
        if(H + W <= 0)break;	
           for (i = 0; i < H; i++ ){
            for (j = 0; j < W; j++ ){
                if((i == 0 || i == H-1) || (j == 0 || j == W-1))
                    System.out.print("#");
                else 
                    System.out.print(".");
            }
             System.out.println("");
		    }
		    System.out.println();
        }
    }
}

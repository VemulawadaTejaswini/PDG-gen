import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int h,w,i,j;
        Scanner s = new Scanner(System.in);
        while(true){
            h = s.nextInt();
            w = s.nextInt();
            if(h==0&&w==0)break;
            for(i=0;i<h;i++){
                for(j=0;j<w;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}

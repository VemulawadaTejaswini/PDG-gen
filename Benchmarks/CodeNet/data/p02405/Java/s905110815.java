import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h,w,i,j;
        while(true){
        h = s.nextInt();
        w = s.nextInt();
        if(h==0&&w==0)break;
        for(i=1;i<=h;i++){
            for(j=1;j<=w;j++){
                if(i % 2 == 1 && j % 2 == 1)System.out.print("#");
                else if (i % 2 == 0 && j % 2 == 0){System.out.print("#");}
                else {System.out.print(".");
                    
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        for(int x=0;x<9;x++){
            for(int y=0;y<9;y++){
                System.out.println(""+(x+1)+"x"+(y+1)+"="+((x+1)*(y+1)));
            }
        }
    }
}
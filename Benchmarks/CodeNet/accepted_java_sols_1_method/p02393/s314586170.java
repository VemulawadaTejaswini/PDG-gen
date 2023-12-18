import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int x=stdIn.nextInt();
        int y=stdIn.nextInt();
        int z=stdIn.nextInt();
        if(x<y){
            if(y<z){
                System.out.println(x+" "+y+" "+z);
            }else if(z<x){
                System.out.println(z+" "+x+" "+y);
            }else{
                System.out.println(x+" "+z+" "+y);
            }
        }
        else if(y<x){
            if(x<z){
                System.out.println(y+" "+x+" "+z);
            }else if(z<y){
                System.out.println(z+" "+y+" "+x);
            }else{
                System.out.println(y+" "+z+" "+x);
            }
        }
    }        
}

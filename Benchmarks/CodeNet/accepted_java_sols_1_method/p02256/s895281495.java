import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z;
        for(;;){
            if(y==0){
                System.out.println(x);
                break; 
            }else{
                z=x;
                x=y;
                y=z%y;
        }   
    }
        sc.close();
    }
}

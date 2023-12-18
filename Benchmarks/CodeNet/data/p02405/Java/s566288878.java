import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int i,a,b;
        int[] h,w;
        h = new int[100];
        w = new int[100];
        Scanner scan = new Scanner(System.in);
        for(i=0;i<100;i++){
            h[i] = scan.nextInt();
            w[i] = scan.nextInt();
            if(h[i]==0 && w[i]==0) break;
        }
        for(i=0;i<100;i++){
            if(h[i]==0 && w[i]==0) break;
            for(a=0;a<h[i];a++){
                for(b=0;b<w[i];b++){
                    if(a%2==0){
                        if(b%2==0){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }else{
                        if(b%2==0){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
         
    }
}

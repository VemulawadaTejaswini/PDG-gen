import java.util.Scanner;
  
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
           int H=sc.nextInt();
           int W=sc.nextInt();
if(H==0 && W==0){
break;
}
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++)System.out.printf("#");
                System.out.printf("\n");
            }
            if(h!=0)System.out.printf("\n");
        }
    }
}
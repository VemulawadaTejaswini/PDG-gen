import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,x,y;
        for(i=0;;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            if((x==0)&&(y==0)){
                break;
            }
            for(j=0;j<x;j++){
                if(j==0 || j==x-1){
                    for(k=0;k<y;k++){
                        System.out.print("#");
                    }
                    System.out.print("\n");
                }
                else{
                    System.out.print("#");
                    for(k=0;k<y-2;k++){
                        System.out.print(".");
                    }
                    System.out.print("#\n");
                }
            }
            System.out.print("\n");
        }
    }
}

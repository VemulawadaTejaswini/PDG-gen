import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        while(h!=0 || w!=0){
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(i%2==0){
                        if(j%2==0){
                            System.out.
                            printf("#");
                        }else{
                            System.out.printf(".");
                        }
                    }else{
                        if(j%2==1){
                            System.out.
                            printf("#");
                        }else{
                            System.out.printf(".");
                        }
                    }
                }
                System.out.printf("\n");
            }
            h=sc.nextInt();
            w=sc.nextInt();
            System.out.printf("\n");
        }
        sc.close();

    }
}

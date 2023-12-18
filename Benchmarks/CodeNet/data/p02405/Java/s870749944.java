import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int i,j;
        String str;
        int h,w;
        while((h=scan.nextInt())!=0){
            w=scan.nextInt();
            for(i=0;i<h;i++){
                if(i%2==0){
                    for(j=0;j<w;j++){
                        if(j%2==0)System.out.printf("#");
                        else System.out.printf(".");
                    }
                }else{
                    for(j=0;j<w;j++){
                        if(j%2==0)System.out.printf(".");
                        else System.out.printf("#");
                    }
                }
                System.out.printf("\n");
            }
            System.out.println();
        }
   }
}

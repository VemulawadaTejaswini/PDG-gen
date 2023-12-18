import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] h=new int[100000];
        int[] w=new int[100000];
        int l=0;
        while(true){
            h[l]=scan.nextInt();
            w[l]=scan.nextInt();
            if(h[l]==0&&w[l]==0) break;
            l++;
        }
        l=0;
        while(true){
            if(h[l]==0&&w[l]==0) break;
            for(int i=0;i<h[l];i++){
                for(int j=0;j<w[l];j++){
                    if(i==0||i==h[l]-1){
                        System.out.printf("#");
                    }
                    else{
                        if(j==0||j==w[l]-1){
                            System.out.printf("#");
                        }
                        else System.out.printf(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
            l++;
        }
    }
}

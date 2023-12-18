import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                for(int i=1;;){
                        int h = sc.nextInt();
                        int w = sc.nextInt();
                        if(h==0 && w==0){
                                break;
                        }
                        for(int j=1;j<=h;j++){
                                for(int k=1;k<=w;k++){
                                        if(j==1 || j==h){
                                                System.out.printf("#");
                                        }else if(k==1 || k==w){
                                                System.out.printf("#");
                                        }else{
                                                System.out.printf(".");
                                        }
                                }
                                System.out.printf("\n");
                        }
                        System.out.printf("\n");
                }
        }
}
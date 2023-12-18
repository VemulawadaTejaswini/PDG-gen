import java.util.*;
class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] pasta = new int[3];
                int[] juice = new int[2];
                for(int i=0;i<3;i++){
                        pasta[i] = sc.nextInt();
                }
                for(int i=0;i<2;i++){
                        juice[i] = sc.nextInt();
                }
                int bestpasta = pasta[0];
                int bestjuice = juice[0];
                for(int i=1;i<3;i++){
                        if(bestpasta > pasta[i]){
                                bestpasta = pasta[i];
                        }
                }
                for(int i=1;i<2;i++){
                        if(bestjuice > juice[i]){
                                best juice = juice[i];
                        }
                }      
                System.out.println(bestpasta + bestjuice - 50);
        }
}
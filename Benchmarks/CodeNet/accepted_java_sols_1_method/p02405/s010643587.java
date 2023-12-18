
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            if(h == 0 && w == 0){
                break;
            }
            for(int i =0;i<w;i++){
                if(i%2==0){
                    sb1.append("#");
                    sb2.append(".");
                }else{
                    sb1.append(".");
                    sb2.append("#");            
                }
            }
            for(int j=0;j<h;j++){
                if(j%2==0){
                    System.out.println(sb1.toString());
                }else{
                    System.out.println(sb2.toString());
                }
            }
            System.out.println();
        }
    }
}



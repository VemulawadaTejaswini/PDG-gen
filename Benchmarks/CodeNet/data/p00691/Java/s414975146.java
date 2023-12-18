import java.util.*;
public class Main {

        public static int [] t ={0,1,2,3,5,7,8,9};
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while(true){
                int z = scan.nextInt();
                if(z==0)break;
                int max=0;
                for(int x=z-1;x>0;x--){
                    for(int y=z-1;y>0;y--){
                        if(Math.pow(x, 3)+Math.pow(y, 3)>Math.pow(z, 3))continue;
                        else{max=(int)Math.pow(x, 3)+(int)Math.pow(y, 3);x=0;break;}
                    }
                }
                System.out.println((int)Math.pow(z, 3)-max);
            }
        }
}
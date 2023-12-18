import java.util.*;
 
class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();   
            int w = sc.nextInt();
            if (h == 0 && w == 0)break;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < h; i++){
                for(int j=0; j < w; j++){
                    if( (i%2 == 0 && j%2 == 0)||(i%2 == 1 && j%2 == 1)){
                        sb.append("#");
                    }
                    else{
                        sb.append(".");
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }   
    }
}
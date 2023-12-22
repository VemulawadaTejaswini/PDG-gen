import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        while(true){
            int h = input.nextInt();
            int w = input.nextInt();
            if(h==0&&w==0){
                break;
            }
            for(int n = 0; n < h; n++){
                for(int i = 0; i < w; i++){
                    if((n == 0 || n == h-1)||(i==0 || i==w-1)){
                    build.append("#");
                    }else{
                    build.append(".");
                    }
                }
                build.append("\n");
            }
             build.append("\n");
        }
        System.out.print(build);
    }
}
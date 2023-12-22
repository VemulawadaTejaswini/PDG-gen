import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        while(true){
            int hight = sc.nextInt();
            int width = sc.nextInt();
            if(hight==0 && width==0){
                break;
            }
            for(int i=0;i<hight;i++){
                String draw = "";
                for(int j=0;j<width;j++){
                    if((i==0 || i==hight-1) || (j==0 || j==width-1)){
                        draw += "#";
                    } else {
                        draw += ".";
                    }
                }
                System.out.println(draw);
            }
            System.out.println("");
        }
        sc.close();
    }
}

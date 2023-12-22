import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h ;
        int w ;
        int t ;
        int y ;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0&&w==0)break;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    t=i%2;
                    y=j%2;
                    if(t!=0&&y==0||y!=0&&t==0){
                        System.out.print(".");
                    }else{
                        System.out.print("#");   
                    }
                }
                System.out.println(); 
            }
            System.out.println();
        }
    }
}

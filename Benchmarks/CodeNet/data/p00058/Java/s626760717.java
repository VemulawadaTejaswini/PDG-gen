import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double[][]point=new double[4][2];
            for(int i=0;i<4;i++){
                point[i][0]=sc.nextDouble();
                point[i][1]=sc.nextDouble();
            }
            double x1=point[1][0]-point[0][0],y1=point[1][1]-point[0][1],x2=point[3][0]-point[2][0],y2=point[3][1]-point[2][1];
            System.out.println((x1*x2+y1*y2)==0?"YES":"NO");
            
        }
    }
}
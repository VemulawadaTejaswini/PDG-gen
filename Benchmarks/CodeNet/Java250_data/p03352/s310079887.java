import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        double tmax=0;
        for (int i=2;i<10;i++){
            for(int k=1;k<32;k++){
                double t = Math.pow(k, i);
                //System.out.println(t);
                if(t > tmax && t<=X){
                    tmax = t;
                    if(t==X){
                        break;
                    }
                }else if(t>X){
                    break;
                }
                
            }
        }
        int ans = (int)tmax;
        System.out.println(ans);
    }
}

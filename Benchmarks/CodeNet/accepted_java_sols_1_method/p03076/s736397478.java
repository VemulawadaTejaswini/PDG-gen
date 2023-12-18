import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double[] A = new double[5];
        
        int pos=0, min=10;
        for(int i=0; i<5; i++){
            String x = sc.next();
            A[i] = Integer.parseInt(x);
            int y = x.charAt(x.length()-1) - '0';
            if(y!=0 && y<min){
                min = y;
                pos = i;
            }
        }
        
        int sum = 0;
        for(int i=0; i<5; i++){
            if(i == pos){
                sum += A[i];
            }else{
                sum += Math.ceil(A[i]/10)*10;
            }
        }
        
        System.out.println(sum);
    }
}

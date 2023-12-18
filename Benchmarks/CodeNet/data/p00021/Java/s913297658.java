import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                double[] x = new double[8];
                for(int i = 0; i < n; i++){
                        for(int j = 0; j < 8; j++){
                                x[j] = sc.nextDouble();
                        }   
                        boolean flag = false;
                        if(x[0] == x[2]){
                                flag = x[4] == x[6];
                        }else{
                                if(x[4] != x[6]){
                                        flag = (x[3]-x[1])*(x[6]-x[4]) == (x[7]-x[5])*(x[2]-x[0]); 
                                }   
                        }   
                        if(flag){
                                System.out.println("YES");
                        }else{
                                System.out.println("NO");
                        }   
                }   
                sc.close();
        }   
}
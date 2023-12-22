import java.util.*;
import java.lang.*;

public class Main{
        public static void main(String[] args){
                Scanner scanCnt = new Scanner(System.in);
                int cnt = scanCnt.nextInt();

                double arrayA[] = new double[cnt];
                String arrayB[] = new String[cnt];

                double res=0;


                for(int i =0; i< arrayA.length ; i++){
                        double scanA = scanCnt.nextDouble();
                        String scanB = scanCnt.next();
                        arrayA[i] = scanA;
                        arrayB[i] = scanB;
                }

                for(int i =0; i< arrayA.length ; i++){
                        if(arrayB[i].equals("JPY")){
                                res += arrayA[i];
                        }else{
                                res += arrayA[i]*380000;
                        }
                }

                System.out.println(res);
        }
}
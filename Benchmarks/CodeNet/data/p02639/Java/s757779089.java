import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);

       for(int i = 1;i<=5;i++){
        if(sc.nextInt()==0){
            System.out.println(i);
        };
    
       }
        /*  int N =sc.nextInt();
        int K =sc.nextInt();
        Map<Integer,Integer> numMap = new HashMap<>();
        Map<Integer,Integer> newMap = new HashMap<>();
        Map<Integer,Integer> hogeMap = new HashMap<>();
        if(N>41){

        }
        for(int i =1;i<=N;i++){
            numMap.put(i, sc.nextInt());
            newMap.put(i,0);
            hogeMap.put(i,0);
        }
        for(int i= 0;i<K;i++){
            //newMap =  numMap;

            for(int i2= 1; i2<=N;i2++){

                    for(int i4 =0 ;i4 <=numMap.get(i2)&&i4+i2<=N;i4++){
                        newMap.replace(i2+i4, newMap.get(i2+i4)+1);
                        if(i4<i2&&i4 != 0){
                            newMap.replace(i2-i4, newMap.get(i2-i4)+1);
                        }
                    }
   /*                  for(int i4 =1 ;i4<i2&&i4<=numMap.get(i2);i4++){
                        newMap.replace(i2-i4, newMap.get(i2-i4)+1);
                    } */
                }
} 
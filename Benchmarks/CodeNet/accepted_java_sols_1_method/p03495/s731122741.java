import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
 
class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int K = sc.nextInt();
                int n;
                
                Map<Integer,Integer> map = new HashMap<Integer,Integer>();
                for(int i=0; i<N; i++){
                    n = sc.nextInt();
                    if(map.containsKey(n)){
                        map.put(n,map.get(n)+1);
                    }else{
                        map.put(n,1);
                    }
                }
                ArrayList<Integer> value = new ArrayList<Integer>(map.values());
                Collections.sort(value);
                int c=0;
                if(value.size()>K){
                    for(int i=0; i<value.size()-K; i++){
                        c += value.get(i);
                    }
                }
                
                
                
                /*
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i=0; i<N; i++){
                    n = sc.nextInt();
                    if(list.indexOf(n)==-1){
                        list.add(n);
                    }
                }
                Collections.sort(list);
                */
                System.out.println(c);
        }
}
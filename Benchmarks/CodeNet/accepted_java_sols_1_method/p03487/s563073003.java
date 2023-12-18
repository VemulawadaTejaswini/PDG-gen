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
                HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
                int N = sc.nextInt();
                int j;
                for(int i=0; i<N; i++){
                        j = sc.nextInt();
                        if(map.containsKey(j)){
                                map.put(j,map.get(j)+1);
                        }else{
                                map.put(j,1);
                        }
                }
                int count = 0;
                for(Integer Key : map.keySet()){
                        if(Key <= map.get(Key)){
                                count += map.get(Key) - Key;
                        }else{
                                count += map.get(Key);
                        }
                }

                System.out.println(count);
        }
}


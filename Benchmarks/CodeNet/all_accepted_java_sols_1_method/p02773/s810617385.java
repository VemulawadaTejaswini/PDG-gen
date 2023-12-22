import java.util.*;
//import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //ArrayList <String> arrlist = new ArrayList <String>();
        TreeMap <String,Integer> treemap = new TreeMap <String,Integer>();
        int max = 0;
        
        for(int i=0; i<N; i++){
            String S = sc.next();
            if(treemap.containsKey(S)){
                treemap.put(S, treemap.get(S)+1);
            }else{
                treemap.put(S, 1);
            }
            //System.out.println(treemap);
        }
        //for(Map.Entry<String, String> entry : treemap.entrySet()){
        for(String S: treemap.keySet()){
            if(max < treemap.get(S)){
                max = treemap.get(S);
            }
        }
        for(String S: treemap.keySet()){
            if(max == treemap.get(S)){
                System.out.println(S);
            }
        }
    }
}
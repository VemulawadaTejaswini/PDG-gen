
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);
        //int N =sc.nextInt();
        //String str = new String(data);
        ArrayList<String>  allmen =new ArrayList <String>(){{}};
        String abc = "abcdefghijklmnopqrstuvwxyz";
        //HashSet doubled =new HashSet<Integer>();
        //Set<?> yourHashSet = new HashSet<>();
        //List<?> sortedList = new ArrayList<>(yourHashSet);
        int bigNum =11;
        Long dog = 1000000000000001l;
        Long alf = 26l;
        Long N = sc.nextLong();
        int counter =1;
        String ans = "";
        //first
        // Long moder1 =  (long) Math.pow(alf, counter);


        for(int i=bigNum;i>=0;i--){
            Long moder =  (long) Math.pow(alf, i);
            int target = (int)(N/moder);
            if(target !=0){
                ans += abc.substring(target-1,target);
                N=N%moder;
            }
        }

/*         while(true){
            Long moder =  (long) Math.pow(alf, counter);
            int target = (int)(N/moder);
            ans += abc.substring(target-1,target);
            if(N%moder != N){
                N = N/moder;
                counter++;
            }else{
                break;
            }
        } */


        System.out.println(ans);


        //System.out.println(ans);
    }
}
    

/*         for(int i=0;i<N-1;i++){
            int target = sc.nextInt();
            if(target < blocker){
                blocker = target;
            }
            if(allmen.contains(target)==false){
                if(target%blocker!=0){
                    allmen.add(target);
                } 
            }
                else{
                    doubled.add(target);
                }       
            
        }
        Collections.sort(allmen);
         //画面表示
        for(int i=0;i <=allmen.size()-1;i++){
            boolean judge = true;
            int target = allmen.get(i);
            if(doubled.contains(target)==false){
                for(int X= 0;X<i;X++){
                    if(target% allmen.get(X)==0){
                        judge = false;
                        break;
                    }
                }
            }else{
                judge = false;
            }
            if(judge == true){
                ans++;
            }
        } */

    
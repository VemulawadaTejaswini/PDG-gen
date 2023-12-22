import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);
        //int N =sc.nextInt();
        ArrayList<Integer>  allmen =new ArrayList <Integer>();
        //HashSet doubled =new HashSet<Integer>();
        
        //Set<?> yourHashSet = new HashSet<>();
        //List<?> sortedList = new ArrayList<>(yourHashSet);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int counter =0;
        //HashSet doubled =new HashSet<Integer>();
        for(int i =0;i <N;i++){
            allmen.add(i, sc.nextInt());
        }
        Collections.sort(allmen);
        for(int i =0;i <K;i++){
            counter += allmen.get(i);
        }

        System.out.println(counter);


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

    
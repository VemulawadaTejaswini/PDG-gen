
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer>  allmen =new ArrayList <Integer>();
        HashSet<Integer>  numberBunker =new HashSet <Integer>();
        HashSet doubled =new HashSet<Integer>();
        int ans=0;
        for(int i=0;i<N;i++){
            int target = sc.nextInt();
            if(allmen.contains(target)==false){
                allmen.add(target);
            }else{
                doubled.add(target);
            }       
        }
        Collections.sort(allmen);
         //画面表示
        for(int i=0;i <=allmen.size()-1;i++){
            Iterator<Integer> it = numberBunker.iterator();
            boolean judge = true;
            int target = allmen.get(i);
            if(doubled.contains(target)==false){
                //for(int X= 0;X<i;X++)
                while(it.hasNext())
                {
                    if(target% it.next()==0){
                        judge = false;
                        break;
                    }
                }
            }else{
                judge = false;
            }
            if(judge == true){
                numberBunker.add(target);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
    
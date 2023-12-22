import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        
        ArrayList<Integer> sortedList = (ArrayList<Integer>) list.clone();
        
        Collections.sort(sortedList);
        
        int mediNum = N/2-1;
        
        for (int i=0;i<N;i++){
            
            int medi = sortedList.get(mediNum);
            int sele = list.get(i);
            //System.out.println(":" + medi + ":" + sele);
            
            if (medi >= sele){
                medi = sortedList.get(mediNum+1);
            }
            
            System.out.println(medi);
        }
        
    }
    
}

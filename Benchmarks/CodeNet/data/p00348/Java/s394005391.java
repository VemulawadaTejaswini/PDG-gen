import java.util.ArrayList;
 
import java.util.List;
import java.util.Scanner;
   
public class Main {
       
     
    public static void main(String[] args) {
            
          try {
                 
            Scanner sc = new Scanner(System.in);
             
            int N = sc.nextInt();
            
            if(N>100000)
            {
            	System.out.println(123);
            }
            
            System.out.println(goLast(addList(sc,N)));
                 
            }catch (Exception e) {
              e.printStackTrace();
            }
        }
       
    private static List<Integer> addList(Scanner sc,int N)
    {
        ArrayList<Integer> motoList = new ArrayList<Integer>(); 
       
        for(int i = 0; i < N; i++)
        {
            int a = sc.nextInt();
            motoList.add(a);    
        }  
        return motoList;
    }
       
   
       
    private static int goLast(List<Integer> motoList)
    {
          
        List<Integer> newList;
        newList = motoList;
        int size = newList.size()-1; 
        int i = 0;
        int round = 0;
         
        while(i<size)
        {
            if(newList.get(i)>newList.get(i+1))
             {
                int bigNum = newList.get(i);
                newList.remove(i);
                newList.add(bigNum);
                i = 0;
                round++;
             }
              
            else
            {
                i++;
            }
              
        }
 
        return round;
         
    }
       
      
}
    
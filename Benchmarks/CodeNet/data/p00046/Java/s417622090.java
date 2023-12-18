import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        ArrayList <Double> mou =new ArrayList <Double>();
        while (scan.hasNext()){
     mou.add(scan.nextDouble());		 
      }
        Collections.sort(mou);
        System.out.println(mou.get((mou.size()-1))-mou.get(0));
        }
      

}
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner( System.in );

        int n = Integer.parseInt( scan.next() );

        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            a.add(Integer.parseInt( scan.next() ) ); 
        }

        Collections.sort(a);

        for(int i=0; i< a.size()-1; i++){
            int div = a.get(i);
            int nextTo = a.get(i+1);
            for(int j=i+1; j<a.size(); j++){
                if( a.get(j)%div == 0){
                    a.remove(j);
                    j--;
                }
            }

            if(div == nextTo){
                a.remove(i);
                i--;
            }
        }

        System.out.println(a.size());

    }
}
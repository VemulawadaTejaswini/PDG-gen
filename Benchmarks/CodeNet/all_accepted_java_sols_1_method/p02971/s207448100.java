import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for(int i=0;i<n;i++)   
            array.add(Integer.parseInt(scan.next()));

        for(int i=0;i<n;i++){
            array2.add(array.get(i));
        }

        Collections.sort(array2);


        int max = Collections.max(array);
        int max2 = array2.get(array2.size()-2);
        for(int i=0;i<n;i++){
            if(array.get(i) != max){
                System.out.println(max);
            }else{
                System.out.println(max2);
            }
        }

    }
}
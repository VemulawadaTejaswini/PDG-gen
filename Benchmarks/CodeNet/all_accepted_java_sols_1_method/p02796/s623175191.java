import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0;i<N;i++){
            int X = sc.nextInt();
            int L = sc.nextInt();
            map.put(X,L);
        }
        int compareX =-1000000010;
        int compareL =0;
        int removeNum=0;

        for(Integer key : map.keySet()){

            if(compareX+compareL > key - map.get(key)){
                removeNum++;
                if(compareX+compareL > key + map.get(key)){
                    compareX = key;
                    compareL = map.get(key);
                }
            } else {
                compareX = key;
                compareL = map.get(key);
            }

        }
        int ansA = N -removeNum;

        System.out.println(ansA);




    }
}





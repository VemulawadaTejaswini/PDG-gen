import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();
        int AverageTemp = sc.nextInt();
        int GoodTemp = sc.nextInt();

        Double[] aryPointTemp = new Double[point];
        Map<Double,Integer> map1 = new HashMap<Double, Integer>();

        for(int i=0 ; i < point ; i++){
            aryPointTemp[i] = Math.abs(GoodTemp - (AverageTemp - (sc.nextInt()*0.006)));
            map1.put(aryPointTemp[i],i+1);
        }
        Arrays.sort(aryPointTemp);
        double a = aryPointTemp[0];
        System.out.println(map1.get(a));
    }
}
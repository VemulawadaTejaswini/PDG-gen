import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // input N D \n x11 x12 ... x1d \n x21 x22 ... x2d
        Scanner sc = new Scanner(System.in);
        int numPoint = sc.nextInt();
        int numDim = sc.nextInt();
        int resTuppleNum = 0;
        ArrayList<ArrayList<Integer>> dimArrayList = new ArrayList<>();
        for(int i = 0; i < numPoint; i++){
            ArrayList<Integer> posArrayList = new ArrayList<>();
            for(int j = 0; j < numDim; j++){
                posArrayList.add(sc.nextInt());
            }
            dimArrayList.add(posArrayList);
        }
        for(int i = 0; i < numPoint; i++){
            for(int j = i + 1; j < numPoint; j++){
                double sumPointDistance = 0;
                for(int k = 0; k < numDim; k++){
                    sumPointDistance += Math.pow(dimArrayList.get(i).get(k) - dimArrayList.get(j).get(k), 2);
                }
                if(isRegularNum(String.valueOf(Math.sqrt(sumPointDistance)))){
                    resTuppleNum++;
                }
            }
        }
        System.out.println(resTuppleNum);
    }

    public static boolean isRegularNum(String num){
        double regNum = Double.parseDouble(num.substring(0, num.indexOf(".")));
        if(String.valueOf(regNum).equals(num)){
            return true;
        } else {
            return false;
        }
    }
}

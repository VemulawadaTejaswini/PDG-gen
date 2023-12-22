
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> ary = new ArrayList<>();
        for(int i=0; i<N; i++){
            ary.add(scanner.nextInt());
        }
        ArrayList<Integer> cp = new ArrayList<>(ary);
        quickSort(cp);

        Integer max = cp.get(0);
        for(int i=0; i<N; i++){
            if(ary.get(i) == max){
                System.out.println(cp.get(1));
            }else{
                System.out.println(max);
            }
        }
    }

    public static void swap(ArrayList<Integer> ary, int i, int j){
        Integer tmp = ary.get(i);
        ary.set(i, ary.get(j));
        ary.set(j, tmp);
    }

    public static int selectPivotIndexRondomly(int left, int right){
        Random rand = new Random();
        return rand.nextInt(right-left+1)+left;
    }

    public static void _quickSort(ArrayList<Integer> ary, int left,int right){
        if(left>=right){return;}
        int pivotIndex = selectPivotIndexRondomly(left, right);
        Integer pivot = ary.get(pivotIndex);
        int l=left, r=right;
        while(l<=r){
            while(ary.get(l)>pivot){l++;}
            while(ary.get(r)<pivot){r--;}
            if(l<=r){
                swap(ary, l, r);
                l++; r--;
            }
        }
        _quickSort(ary, left, r);
        _quickSort(ary, l, right);
    }
    public static void quickSort(ArrayList<Integer> ary){
        int l = 0;
        int r = ary.size() - 1;
        _quickSort(ary, l, r);
    }
}

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int iniNum;
        iniNum = scan.nextInt();
        int[] a=new int[iniNum];
        
        for(int i=0; i<iniNum; i++){
            a[i]=scan.nextInt();
        }
        insertionSort(a, iniNum);
    }

    public static void insertionSort(int[] A, int N){ // N個の要素を含む0-オリジンの配列A
        int j, v;
        Pattern pat1 = Pattern.compile("[^0-9 ]");
        for(int i=0; i<N; i++){
            v = A[i];
            j = i - 1;
            
            while(j >= 0 && A[j] > v){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            Matcher mat1 = pat1.matcher(Arrays.toString(A));
            System.out.println(mat1.replaceAll(""));
        }
    }
}

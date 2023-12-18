import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static String print(List<Integer> list) {
        String result;
        result = "";
        for (int index = 0;index<list.size();index++) {
            if(index == 0) {
                result+=String.format("%d",list.get(index));
            }else{
                result+=String.format(" %d",list.get(index));
            }
        }
        return result;
    }
    private static void InsertSort(List<Integer> A,int N) {
        System.out.println(print(A));
        for(int n = 1;n<N;n++) {
            Integer v = A.get(n);
            Integer j = n - 1;
            while (j >= 0 && A.get(j) > v) {
                A.set(j + 1, A.get(j));
                j--;
                A.set(j + 1, v);
            }
            System.out.println(print(A));
        }
    }
    public static void main(String[] args) {
        List<Integer> IntList = new ArrayList<Integer>();
        Scanner sc;
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0;i<n;i++) {
            IntList.add(Integer.parseInt(sc.next()));
        }

        InsertSort(IntList,n);


    }
}

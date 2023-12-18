import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arrays = new String[N][3];
        for(int i=0;i<N;i++){
            arrays[i][0] = sc.next();
            arrays[i][1] = sc.next();
            arrays[i][2] = String.valueOf(i+1);
        }
        sc.close();
        Arrays.sort(arrays, (a,b)->Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1])));
        Arrays.sort(arrays, (a,b)->a[0].compareTo(b[0]));
        for(int i=0;i<N;i++){
            System.out.println(arrays[i][2]);
        }

    }
}
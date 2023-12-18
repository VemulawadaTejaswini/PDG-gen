import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int[][] data = new int[n][2];
        int[] two = new int[n];
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        };

        for (int i=0;i<n;i++){
            String s = sc.next();
            int count = 0;
            boolean b = true;
            for (int j=0;j<s.length();j++){
                if (!b)count++;
                if (s.charAt(j)!='.'){
                    a[i]=a[i]*10+s.charAt(j)-'0';
                }else {
                    b=false;
                }
            }
            while (count<9){
                a[i]*=10;
                count++;
            }
            long ins = a[i];
            while (ins%2==0){
                ins/=2;
                data[i][0]++;
                two[i]++;
            }
            ins = a[i];
            while (ins%5==0){
                ins/=5;
                data[i][1]++;
            }
        }
        //10^18=2^18 * 5^18 => data[i][0]+data[j][0]>=18&&data[i][1]+data[j][1]>=18;
        Arrays.sort(data,comparator);
        Arrays.sort(two);
        int[] five = new int[n];
        for (int i=0;i<n;i++){
            five[i]=data[i][1];
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            int pos = binarySearch(two,18-data[i][0]);
            if (pos<0)pos=0;
            pos = Math.max(i+1,pos);
            int[] localF = Arrays.copyOfRange(five,pos,n);
            Arrays.sort(localF);
            int Lpos = binarySearch(localF,18-data[i][1]);
            if (Lpos<0)Lpos=0;
            ans+= localF.length-Lpos;
        }
        System.out.println(ans);
    }
    public static int binarySearch(int[] array, int target){
        int pos = -1;
        int left = 0;
        int right = array.length-1;
        int middle = 0;
        while (pos==-1&&left<=right){
            middle = (left+right)/2;
            if (array[middle]==target)pos=middle;
            else if (array[middle]>target)right=middle-1;
            else left=middle+1;
        }
        if (pos==-1)pos=left;
        return pos;
    }
}

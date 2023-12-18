import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            l[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(l);
        for(int i = 0;i<n-2;i++){
            int temp1 = l[i];
            int temp2 = 0;
            int temp3 = 0;
            for(int j = i+1;j<n-1;j++){
                temp2 = l[j];
                for(int k = j + 1;k<n;k++){
                    temp3 = l[k];
                    if(temp1 < temp2 && temp2 < temp3 && temp1 + temp2 > temp3){
                        count++;
                    }
                }
            }            
        }
        System.out.println(count);
    }
}
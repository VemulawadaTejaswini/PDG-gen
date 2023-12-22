import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[]=new Integer[n];
        Integer arrToSort[]=new Integer[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arrToSort[i]=arr[i];
        }
        Arrays.sort(arr);
        int cnt=0;
        for (int i=0;i<n;i++){
            if (!arr[i].equals(arrToSort[i])){
                cnt++;
            }
        }
        if (cnt!=2 && cnt!=0) {
            System.out.println("NO");
        }else System.out.println("YES");

    }

}


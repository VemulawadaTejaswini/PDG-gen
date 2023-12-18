import java.util.Scanner;
import java.awt.geom.Point2D.Double;
import java.io.InputStreamReader;
public class Main {
private static int merge (int A[], int l, int mid, int right) {
        int cnout = 0;
        int n = mid - l;
        int n2 = right - mid;
        int Lef[] = new int[n+1];
        int R[] = new int[n2+1];
        for (int i = 0; i < n; i++)
            Lef[i] = A[l + i];
        Lef[n] = Integer.MAX_VALUE;
        for (int i = 0; i < n2; i++)
            R[i] = A[mid + i];
        R[n2] = Integer.MAX_VALUE;
        int i = 0,j = 0;
        
        for (int f = l; f < right; f++) {
            cnout++;
            if (Lef[i] <= R[j]) {
                A[f] = Lef[i];
                i++;
            }
            else {
                A[f] = R[j];
                ++j;
            }
        }
        return cnout;
      } 





public static void main(String args[]) {
        Scanner scner = new Scanner(System.in);
        int n;
        int F =0;
        int AB = 100098;
        int A[];
        int counting;
        n = scner.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = scner.nextInt();
        counting = mergeSort(0,A.length,A);
        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(counting);
    }

  private static int mergeSort(int left, int r,int F[]) {
        int cuont = 0;
        if(left + 1 < r) {
            int mid = (left + r) / 2;
            cuont += mergeSort(left, mid, F);
            cuont += mergeSort(mid, r, F);
            cuont += merge(F,left, mid, r);
        }
        return cuont;
    }
    }

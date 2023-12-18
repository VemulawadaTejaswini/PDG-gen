import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	  int n = Integer.parseInt(br.readLine());
    //String str = br.readLine();
	  String A[] = new String[n + 1];
    String A2[] = new String[n + 1];
  
	  /**/for(int i = 0;i < n;i++){
      A[i] = br.readLine();
		   A2[i] = A[i];
    }
    
	  //String Ar[] = new String[n];
	  //String A2r[] = new String[N];
    //Ar = BubbleSort(A, n);
    mergeSort(A, 0, n);
	  //if(Cr.equals(C)){
		  //System.out.println("Stable");
	  //}
	  //else System.out.println("Not Stable");
	  quickSort(A2, 0, n - 1);
	  if(Arrays.equals(A, A2)){
		  System.out.println("Stable");
	  }
    else System.out.println("Not stable");
    for(int i = 0;i < n;i++){
      System.out.println(A2[i]);
      //if(i != n - 1) System.out.print(" ");
    }
    //System.out.println();
  }
  
	public static String[] BubbleSort(String[] A, int n){
		for(int i = 0;i < n - 1;i++){
			for(int j = n - 1;j > i;j--){
				if(A[j].charAt(2) < A[j - 1].charAt(2)){/*charAtの引数:1->2*/
					String tmp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmp;
				}
			}
		}
		/*for(int i = 0;i < N;i++){
			 System.out.print(C[i]);
			 if(i != N - 1) System.out.print(" ");
		}
		System.out.println();*/
		return A;
	} 
  static void quickSort(String[] A, int p, int r){
    if(p < r){
      int q = partition(A, p, r);
      quickSort(A, p, q - 1);
      quickSort(A, q + 1, r);
    }
    //return A;
  }
  static int partition(String[] A, int p, int r){
    int x = Integer.parseInt(A[r].substring(2));
    int i = p - 1;
    for(int j = p;j < r;j++){
      if(Integer.parseInt(A[j].substring(2)) <= x){
        i++;
        String tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
      }
    } 
    String tmp = A[i + 1];
    A[i + 1] = A[r];
    A[r] = tmp;

    return i + 1;
  }
  static void mergeSort(String[] A, int l, int r){
    if(l + 1 < r){
      int m = (l + r) / 2;
      mergeSort(A, l, m);
      mergeSort(A, m, r);
      merge(A, l, m, r);
    }
  }
  static void merge(String[] A, int l, int m, int r){
   int n1 = m - l;
   int n2 = r - m;
   String[] L = new String[n1 + 1];
   String[] R = new String[n2 + 1];
   
   for(int i = 0;i < n1;i++) L[i] = A[l + i];
   for(int i = 0;i < n2;i++) R[i] = A[m + i];

   L[n1] = "I 1000000001";
   R[n2] = L[n1];

   int i = 0, j = 0;
    for(int k = l;k < r;k++){
      if(Integer.parseInt(L[i].substring(2)) <= Integer.parseInt(R[j].substring(2))){
        A[k] = L[i];
        i++;
      }
      else {
        A[k] = R[j];
        j++;
      }
    }
  }
}


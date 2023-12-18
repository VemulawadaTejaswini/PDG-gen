import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s;
    String [] Array_a = new String[n];
    String [] Array_b = new String[n];
    for(int i = 0; i <n; i++){
      s = sc.next();
      Array_a[i] = s;
      Array_b[i] = s;
    }
    System.arraycopy(Array_a,0,bubblesort(Array_a,n),0,n);
    Print_Array(Array_a, n);
    System.out.println("Stable");

    System.arraycopy(Array_b,0,selectionsort(Array_b,n),0,n);
    Print_Array(Array_b, n);
    if(Judge_stable(Array_b,Array_a,n)==true){
      System.out.println("Stable");
    }else{
      System.out.println("Not stable");
    }

  }
  static String [] bubblesort(String [] S, int n){
    String tmp;
    for(int i = 0; i<n;i++){
      for(int j = n-1; j>i;j--){
        if(S[j].charAt(1) <S[j-1].charAt(1)){
          tmp = S[j];
          S[j] = S[j-1];
          S[j-1] = tmp;
        }
      }
    }
    return S;
  }

  static String [] selectionsort(String [] S, int n){
    String tmp;
    int minj;
    for(int i =0; i<n; i++){
      minj = i;
      for(int j = i; j<n;j++){
        if(S[minj].charAt(1)>S[j].charAt(1))minj =j;
      }
      tmp = S[minj];
      S[minj] = S[i];
      S[i] = tmp;
    }
    return S;
  }

  static void Print_Array(String [] S, int n){
    for(int i = 0; i<n-1;i++){
      System.out.printf("%s ", S[i]);
    }
    System.out.println(S[n-1]);
  }

  static boolean Judge_stable(String [] S, String [] stable_array,int n){
    for(int i = 0; i<n; i++){
      if(S[i]!=stable_array[i])return false;
    }
    return true;
  }
}

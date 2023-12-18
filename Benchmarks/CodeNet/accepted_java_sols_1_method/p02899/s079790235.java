import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int array1[] = new int[n];
    int array2[] = new int[n];
    int min = 0;
    for(int i = 0; i<n; i++){
      array1[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      array2[array1[i]-1] = i + 1;  
    }
    for(int i = 0; i< n; i++)
      System.out.print(array2[i] + " ");
  }
}
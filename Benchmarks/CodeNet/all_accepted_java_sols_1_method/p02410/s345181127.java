import java.util.Scanner;


public class Main { 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
      
       int [] [] Arr1 = new int [n] [m];
       int [] [] Arr2 = new int [m][1];
       for(int j =0; j<n;j++){
           for(int i = 0; i<m; i++){
           Arr1 [j][i] = sc.nextInt();
           }
       }
       for(int i = 0; i<m; i++){
       Arr2[i][0] = sc.nextInt();
       }
       

       for(int j = 0; j<n; j++){
       int M = 0;
           for(int i = 0; i<m;i++){
           M = M +Arr2[i][0] * Arr1[j][i];}
       System.out.println(M);
       }
}}


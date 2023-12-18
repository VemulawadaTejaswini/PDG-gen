import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i < n;i++){
      arr[i] = sc.nextInt();
    }
    
    Arrays.sort(arr);
    
    int x = 0;
    for(int i = 0;i < n-1;i++){
      x += arr[i];
    }
    if(arr[n-1]>x){
      System.out.println("No");
    }
    else if(arr[n-1]==x){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }

  }

}


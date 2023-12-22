import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int count=0;
    
    int n=sc.nextInt();  
    int array1[]=new int[n];
    for(int i=0;i<n;i++)array1[i]=sc.nextInt();
    
    int q=sc.nextInt();
    int array2[]=new int[q];
    for(int i=0;i<q;i++) array2[i]=sc.nextInt();
   
    for(int i=0;i<q;i++){
      int start=0;
      int goal=n-1;
      while(true){
        int middle=(int)(start+goal)/2;
        if(array2[i]==array1[middle]){
          count+=1;
          break;
        }
        if(start-goal>-1) break;
        else if(array1[middle]<array2[i]) start=middle+1;
        else if(array2[i]<array1[middle]) goal=middle-1;
      }
    }
    System.out.println(count);
  }
}

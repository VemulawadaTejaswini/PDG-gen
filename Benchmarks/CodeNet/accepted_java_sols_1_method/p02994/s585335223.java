import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt(); //N個のりんご
      int l=sc.nextInt();
      int arr[]=new int[n]; //りんごの味
      for(int s=0;s<n;s++){
        arr[s]=l+s;
      }
      int total=0;
      for(int s=0;s<n;s++){
        total+=arr[s];
      }
      int newa[]=new int[n];
      for(int s=0;s<n;s++){
        newa[s]=Math.abs(arr[s]);
      }
      int min=300;
      int ans=0;
      for(int s=0;s<n;s++){
        if(min>newa[s]){
          min=newa[s];
          ans=s;
        }
      }
      System.out.println(total-arr[ans]);


    }
  }
}

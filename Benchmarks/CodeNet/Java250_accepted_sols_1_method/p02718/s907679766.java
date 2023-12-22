  import java.util.*;
  class Main{
      public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      int n=stdIn.nextInt();
      int m=stdIn.nextInt();
      Integer[] aa=new Integer[n];
      int sum=0;
      for(int l=0;l<n;l++){
          int j=stdIn.nextInt();
          aa[l]=j;
          sum+=j;
      }
      double k=sum/(4.0*m);

      Arrays.sort(aa, Collections.reverseOrder()); 
      if(aa[m-1]<k){
          System.out.println("No");
      }else{
          System.out.println("Yes");
      }   
      }
  }


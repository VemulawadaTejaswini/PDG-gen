import java.util.Scanner;
 
 
 
public class Main {
static int n;
static int S[]=new int[500001];
static int count=0;
 
  public static void merge(int left,int mid,int right){
      int i,j;
      mid=(left+right)/2;
 
      
      ;
      int infty=Integer.MAX_VALUE;
 
      int R[]=new int[mid-left+2];
      int L[]=new int[right-mid+2];
 
      for(i=0;i<mid-left+2;i++){
          L[i]=S[left+i];
      }
      for(i=0;i<right-mid;i++){
          R[i]=S[mid+i];
      }
 
      L[mid-left]=infty;
      R[right-mid]=infty;
    i=0;
    j=0;
 
    for(int k=left;k<right;k++){
        count++;
        if(L[i]<=R[j]){
            S[k]=L[i];
            i++;
        }
        else{
            S[k]=R[j];
            j++;
        }
    }
  }
   
  public static void mergesort(int left,int right){
      if(left+1<right){
          int mid=(left+right)/2;
           
          mergesort(left,mid);
          mergesort(mid,right);
          merge(left,mid,right);
          
      }
  }
   
   
    public static void main(String[] args) {
 
         Scanner sc=new Scanner(System.in);
         n=Integer.parseInt(sc.next());
 
          for(int i=0;i<n;i++){
              S[i]=Integer.parseInt(sc.next());
          }
         
          
          mergesort(0,n);
          
 
              for(int i=0;i<n;i++){
                    String s = String.valueOf(S[i]);
					s += (i==n-1) ? '\n' : ' ';
/*					System.out.print(s);
					
                    if(i==n-1){
					  System.out.println("");
                    } else{
                      System.out.print(" ");
              		}
*/
              }
              System.out.println(count);
  }
}
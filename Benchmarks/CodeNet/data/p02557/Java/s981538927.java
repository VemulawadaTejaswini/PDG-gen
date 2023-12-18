import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++){a[i]=sc.nextInt();}
    for(int i=0;i<n;i++){b[i]=sc.nextInt();}
    Deque<Integer> dq=new ArrayDeque<>();
    for(int i=0;i<n;i++){
      if(a[i]==b[i]){
        dq.add(i);
      }
    }
    int l=-2,r=-2;
    while(!dq.isEmpty()){
      if(dq.size()==1){
        l=r=dq.peekFirst();
        break;
      }else{
        int f=dq.pollFirst();
        int t=dq.pollLast();
        if(b[f]==b[t]){
          l=f;
          r=t;
          break;
        }
        int tmp=b[f];
        b[f]=b[t];
        b[t]=tmp;
      }
    }
//    System.err.println(Arrays.toString(b));
    if(!dq.isEmpty()){
      for(int i=l;i<=r&&b[i]!=a[i-l];i++){
        int tmp=b[i];
        b[i]=b[i-l];
        b[i-l]=tmp;
      }
      for(int i=r;i>=l&&b[i]==a[i]&&b[i]!=a[i-r+n-1];i--){
        int tmp=b[i];
        b[i]=b[i-r+n-1];
        b[i-r+n-1]=tmp;
      }
    }
//    System.err.println(Arrays.toString(b));
    boolean dame=false;
    for(int i=0;i<n;i++){
      if(a[i]==b[i]){
        dame=true;
        break;
      }
    }
    if(dame){
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
    for(int i=0;i<n;i++){
      System.out.print(b[i]+" ");
    }
    System.out.println();
  }
}
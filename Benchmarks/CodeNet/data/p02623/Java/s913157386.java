import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int s=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[k];

    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
for(int i=0;i<k;i++){
  b[i]=sc.nextInt();
}
int p=0; int l=0;
int count=0;
while(p<n && l<k && s>0){
  if(a[p]<b[l]){

    if(a[p]<=s){
      s=s-a[p];
      count=count+1;
            p++;
      if(s<=0){
        break;
      }
    }
    else {
      break;
    }



  }
  else {
        if(b[l]<=s){
      s=s-b[l];
      count=count+1;
            l++;
      if(s<=0){
        break;
      }
    }
    else {
      break;
    }
  }

}

if(p==n &&s>0){
  while(l<=k && s>0){
    if(b[l]<=s){
      s=s-b[l];
      count=count+1;
      l=l+1;

    }
    else {
      break;
    }
  
  }
}

if(l==k &&s>0){
  while(n<=p && s>0){
    if(a[p]<=s){
      s=s-a[p];
      count=count+1;
      p=p+1;
      
    }
    else {
      break;
    }
  
  }
}
    System.out.print(count);
  }
}
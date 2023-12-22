import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
long x = sc.nextLong();
long[] arr = new long[N];
  for(int i=0;i<N;i++){
    arr[i] = sc.nextInt();
  }
Arrays.sort(arr);
int count=0;
for(int i=0;i<N;i++){
  if(i!=N-1){
    if(arr[i]<=x){
      x -= arr[i];
      count++;
    }else{
      break;
    }
  }else{
    if(arr[i]==x){
      count++;
    }else{
      break;
    }
  }

}
System.out.println(count);
}
}

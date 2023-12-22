import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] L = new int[n];
      for(int i=0;i<n;i++){
        L[i] = Integer.parseInt(sc.next());
      }

      Arrays.sort(L); //二分探索用（昇順）

      int ans = 0;

      for(int i=n-1;i>=0;i--){ //1番目に長い棒を固定
        for(int j=i-1;j>=0;j--){ //2番目に長い棒を固定
//////////////////////////////////////////////////////
//二分探索処理開始
int start = 0;
int end = j;
int sa = L[i]-L[j];
int cnt = -1;
while(true){
  int a = start+end;
  int mid = a/2;
  if(L[mid]>sa){ //L[mid以降]は使える。
    end = mid;
  }
  else if(L[mid]<=sa){ //L[mid以前]は使えない。
    start = mid;
  }

  if(a==(start+end) && L[mid]>sa){
    cnt = mid;  //L[mid以降]は使えることの記録。
    break;
  }
  if(a==(start+end) && L[mid+1]>sa){
    cnt = mid+1;  //L[mid]は使えないが、L[mid+1以降]は使えることの記録。
    break;
  }
  if(a==(start+end) && L[mid]<=sa){
    //使える棒はない
    break;
  }
}

if(cnt!=-1 && j>=1){ //cntが-1なら使える棒なし && j=0はありえない
  ans += (j-1)-(cnt)+1;
}
//二分探索処理終了
//////////////////////////////////////////////////////
        }
      }

      System.out.println(ans);

    }
}

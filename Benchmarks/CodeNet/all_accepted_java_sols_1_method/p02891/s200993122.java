import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      long k = Long.parseLong(sc.next());

      String start = s.substring(0,1);
      String end = s.substring(lng-1,lng);

      long ans = 0;

      int onaji = 1; //同じ数が何個続いたか
      long[] onajiN = new long[3]; //[0]初め、[1]終わり、[2]中全部
      int cnt = 0;
      char all = c[0];
      int ok = 0;
///////////////////////////////////////////////
for(int i=1;i<lng;i++){
  if(c[i-1]==c[i]){
    onaji ++;
  }
  else{
    onajiN[cnt] = onaji;
    cnt = 2;
    onaji = 1;
  }
}
onajiN[1] = onaji;

for(int i=1;i<lng;i++){
  if(all!=c[i]){
    all = '-';
  }
  if(c[i-1]==c[i]){
    //onaji ++;
    ans++;
    c[i] = '-';
  }
  //else{
    //onajiN[cnt] = onaji;
    //cnt = 2;
    //onaji = 1;
  //}
}


//System.out.println(onajiN[0]);
//System.out.println(onajiN[1]);

if(!(start.equals(end))){ok = 1;} //両端違うなら独立
if(c[lng-1]=='-'){ok = 1;} //最後が書き換わってれば両端同じは無視

if(ok==1){
  ans = ans*k;
}
else{ //両端が同じかつ最後が書き換わってない場合
/////////////////////////////////////////////////////////////
if(all==c[0]){ //全部同じ文字
  ans = k*ans + k/2;
}
else{ //mae[---]ushiro
  if(onajiN[0]%2==0){ //maeが偶数個
    ans = ans*k; //独立と同じ
  }
  else{ //maeが奇数個
    ans = ans*k;
    //連結ごとに1個増える
    ans = ans + k-1;

  }

}
/////////////////////////////////////////////////////////////
}



System.out.println(ans);

    }
}

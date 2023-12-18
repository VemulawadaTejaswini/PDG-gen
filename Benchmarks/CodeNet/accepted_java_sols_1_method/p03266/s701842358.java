import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long k = scan.nextLong();
    long sum = 0;
    long[] amari1 = new long[2];
    long a;
    int c=1;
    /*for(int i = 1;i <= n;i++){
      amari = i%k;
      if(amari1[amari] == 1){
        for(int l=0;l < k;l++){
          c +=amari1[l];
        }
        if(c == k){
          break;
        }
        c = 0;
        continue;
      }else{
        amari1[amari] = 1;
        a = (n - amari)/k;
        b = (n -(k-amari))/k;
        sum += a*a*b*2;
      }
    }*/

    if(k == (k/2)*2){
      amari1[0] = 0;
      amari1[1] = k/2;
      c=2;
    }
    for(int l = 0;l < c;l++){
    a = (n+amari1[l])/k;
    sum += (a*a*a);
  }

    System.out.println(sum);


  }
}
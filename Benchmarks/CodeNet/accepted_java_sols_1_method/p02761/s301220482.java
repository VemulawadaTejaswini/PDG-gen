import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int number_digit;
    int number;

    Map<Integer,Integer> map = new HashMap<>();


    for(int i=0; i<m; i++){
      number_digit = sc.nextInt()-1;
      number = sc.nextInt();
      if(map.containsKey(number_digit)&&number!=map.get(number_digit)){
        System.out.println(-1);
        return;
      }
      map.put(number_digit,number);
    }


    if(map.containsKey(0)){
      if(map.get(0)==0&&n!=1){
        System.out.println(-1);
        return;
      }
    }

    if(n==1&&m==0){
      System.out.println(0);
      return;
    }
    int ans=0;
    outside:for(int i=(int)Math.pow(10,n-1); i<(int)Math.pow(10,n); i++){
      char[] c = new char[n];
      c = String.valueOf(i).toCharArray();
      for(int key : map.keySet()){
        if((int)c[key]-48!=map.get(key)){
          continue outside;
        }
      }
      ans = i;
      break;
    }

    System.out.println(ans);

  }
}
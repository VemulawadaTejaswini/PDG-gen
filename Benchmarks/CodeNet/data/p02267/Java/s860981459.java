import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n+1];
    for(int i = 0; i < n; i++){s[i] = sc.nextInt();}
    int q = sc.nextInt();
    int[] t = new int[q];
    for(int i = 0; i < q; i++){t[i] = sc.nextInt();}
    int max = n;
    int cnt = 0;

    for(int i = 0 ; i < q; i++){
      if(banpei(s, t[i], max)){cnt++;}
    }

    System.out.println(cnt);
  }

  public static boolean banpei(int[] s, int key, int max){
    int i = 0;
    s[max] = key;

    while(true){
      if(s[i] == key){
        break;
      }
      i++;
    }

    if(i == max){return false;}
    return true;
  }
}


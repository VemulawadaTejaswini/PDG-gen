import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    sc.close();

    String[] S = s.split("");
    String[] T = t.split("");

    HashMap<String, Integer> mapS = new HashMap<String, Integer>();
    HashMap<String, Integer> mapT = new HashMap<String, Integer>();

    for (int i = 0; i < S.length; i++) {
      if (mapS.containsKey(S[i])) {
        int v = mapS.get(S[i]);
        mapS.put(S[i],v+1);
      } else {
        mapS.put(S[i],1);
      }
    }

    for (int i = 0; i < T.length; i++) {
      if (mapT.containsKey(T[i])) {
        int v = mapT.get(T[i]);
        mapT.put(T[i],v+1);
      } else {
        mapT.put(T[i],1);
      }
    }

    int[] arrS = new int[200000];
    int[] arrT = new int[200000];

    for (Integer val : mapS.values()) {
      arrS[val]++;
    }

    for (Integer val : mapT.values()) {
      arrT[val]++;
    }

    String result = "Yes";

    for (int i = 0; i < 200000; i++) {
      if (arrS[i] != arrT[i]){
        result = "No";
        break;
      }
    }

    System.out.println(result);

  }

}
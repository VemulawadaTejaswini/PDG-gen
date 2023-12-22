import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nk = new int[2];
    for (int i = 0; i < nk.length; i++){
      nk[i] = sc.nextInt();
    }
    sc.nextLine();
    int[] pn = new int[nk[0]];
	for (int i = 0; i < nk[0]; i++){
      pn[i] = sc.nextInt();
    }
    Arrays.sort(pn);
    int answer = 0;
    for (int i = 0; i < nk[1]; i++){
      answer += pn[i];
    }
    System.out.println(answer);
  }
}

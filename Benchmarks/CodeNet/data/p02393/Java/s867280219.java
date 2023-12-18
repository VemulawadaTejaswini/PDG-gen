import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[] tmp = new int[3];

    for(int i = 0; i < 3; i++){
      tmp[i] = sc.nextInt();
    }

    Arrays.sort(tmp);

    System.out.println(tmp[0] + " " + tmp[1] + " " + tmp[2]);
  }
}


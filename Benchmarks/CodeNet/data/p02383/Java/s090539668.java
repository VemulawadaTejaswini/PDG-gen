public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int[] dice;
    int i, n;
    String str;
    char[] ch;

    dice = new int[6];
    for(i = 0;i < 6;i++){
      dice[i] = sc.nextInt();
    }
    str = sc.next();
    n = str.length();
    ch = new char[n];
    for(i = 0;i < n;i++){
      ch[i] = str.charAt(i);
    }

    for(i = 0;i < n;i++){
      if(ch[i] == 'N'){
        nroll(dice);
      }else if(ch[i] == 'E'){
        eroll(dice);
      }else if(ch[i] == 'W'){
        eroll(dice);
        eroll(dice);
        eroll(dice);
      }else{
        nroll(dice);
        nroll(dice);
        nroll(dice);
      }
    }

    System.out.println(dice[0]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void nroll(int[] dice){ //(1265)
    int tmp;
    tmp = dice[0];
    dice[0] = dice[1];
    dice[1] = dice[5];
    dice[5] = dice[4];
    dice[4] = tmp;
    return;
  }

  private static void eroll(int[] dice){ //(1463)
    int tmp;
    tmp = dice[0];
    dice[0] = dice[3];
    dice[3] = dice[5];
    dice[5] = dice[2];
    dice[2] = tmp;
    return;
  }

}
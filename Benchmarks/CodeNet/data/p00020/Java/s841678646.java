public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str;
    char[] ch, ch2;
    int i, j, n, m;

    str = sc.nextLine();
    m = str.length();
    ch = new char[m];
    ch2 = new char[m];
    for(i = 0;i < m;i++){
      ch[i] = str.charAt(i);
      ch2[i] = ch[i];
    }

    n = 0;
    for(i = 1;i <= 25;i++){
      for(j = 0;j < m;j++){
        if(ch[j] >= 'a' && ch[j] <= 'z'){
          ch2[j] = (char)((ch[j] + i) % ('z' + 1));
          if(ch2[j] < 'a')ch2[j] += 'a';
        }
      }
      for(j = 0;j < m - 3;j++){
        if(ch2[j] == 't' && ch2[j + 1] == 'h'
        && ch2[j + 2] == 'a' && ch2[j + 3] == 't'){
          n = 1;
          break;
        }else if(ch2[j] == 't' && ch2[j + 1] == 'h'
        && ch2[j + 2] == 'i' && ch2[j + 3] == 's'){
          n = 1;
          break;
        }else if(ch2[j] == 't' && ch2[j + 1] == 'h'
        && ch2[j + 2] == 'e'){
          n = 1;
          break;
        }else if(ch2[j + 1] == 't' && ch2[j + 2] == 'h'
        && ch2[j + 3] == 'e'){
          n = 1;
          break;
        }
      }
      if(n == 1)break;
    }

    for(i = 0;i < m;i++){
      System.out.print(ch2[i]);
    }
    System.out.println();



    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}
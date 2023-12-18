import java.io.*;

class DISE
{
  public int[] roll(int[] f, char way)
  {
    int[] n = {f[0], f[1], f[2], f[3], f[4], f[5]};

    switch(way){
      case 'N':
        f[0] = n[1];
        f[1] = n[5];
        f[4] = n[0];
        f[5] = n[4];
        break;
      case 'S':
        f[0] = n[4];
        f[1] = n[0];
        f[4] = n[5];
        f[5] = n[1];
        break;
      case 'E':
        f[0] = n[3];
        f[2] = n[0];
        f[3] = n[5];
        f[5] = n[2];
        break;
      case 'W':
        f[0] = n[2];
        f[2] = n[5];
        f[3] = n[0];
        f[5] = n[3];
        break;
      default:
        break;
    }
    return f;
  }
}

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] face = str.split(" ");
    int[] num = {0, 1, 2, 3, 4, 5};

    DISE dise = new DISE();
    int j;
    str = br.readLine();
    for(int i = 0; i < str.length(); i++){
      dise.roll(num, str.charAt(i));
    }
    System.out.println(face[num[0]]);
  }
}
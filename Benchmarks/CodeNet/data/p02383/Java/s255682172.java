import java.io.*;

class Dice
{
  String[] face;
  int[] num;

  public Dice(String str) //?????????
  {
    this.face = new String[6];
    this.face = str.split(" ");
    this.num = new int[6];
    for(int i = 0; i < this.face.length; i++) num[i] = i;
  }

  public String get(int n) { return this.face[num[n]]; } //?????°?????¢?????????

  public void roll(char way) //?????¢???????????????????????¢?????????????????´??????
  {
    int tmp;
    switch(way){
      case 'N':
        tmp = num[0];
        this.num[0] = this.num[1];
        this.num[1] = this.num[5];
        this.num[5] = this.num[4];
        this.num[4] = tmp;
        break;
      case 'S':
        tmp = this.num[0];
        this.num[0] = this.num[4];
        this.num[4] = this.num[5];
        this.num[5] = this.num[1];
        this.num[1] = tmp;
        break;
      case 'E':
        tmp = this.num[0];
        this.num[0] = this.num[3];
        this.num[3] = this.num[5];
        this.num[5] = this.num[2];
        this.num[2] = tmp;
        break;
      case 'W':
        tmp = this.num[0];
        this.num[0] = this.num[2];
        this.num[2] = this.num[5];
        this.num[5] = this.num[3];
        this.num[3] = tmp;
        break;
      default:
        break;
    }
  }
}

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Dice dice = new Dice(str);

    str = br.readLine();
    for(int i = 0; i < str.length(); i++){
      dice.roll(str.charAt(i));
    }
    System.out.println(dice.get(0));
  }
}
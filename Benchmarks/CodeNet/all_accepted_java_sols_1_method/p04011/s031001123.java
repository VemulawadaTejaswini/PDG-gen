import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int stayTimeAll = Integer.parseInt(bf.readLine());
    int firstStayTime = Integer.parseInt(bf.readLine());
    int firstMoney = Integer.parseInt(bf.readLine());
    int lastMoney = Integer.parseInt(bf.readLine());

    int lastStayTime = 0;
    if (stayTimeAll > firstStayTime) {
      lastStayTime = stayTimeAll - firstStayTime;
    } else {
      firstStayTime = stayTimeAll;
    }

    System.out.println((firstStayTime * firstMoney) + (lastStayTime * lastMoney));
  }
}
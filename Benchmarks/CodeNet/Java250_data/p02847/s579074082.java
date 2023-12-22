import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Week week = Week.valueOf(br.readLine());
    System.out.println(7 - week.ordinal());
  }
}

enum Week {
	SUN,MON,TUE,WED,THU,FRI,SAT
}
  
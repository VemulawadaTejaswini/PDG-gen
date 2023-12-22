import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numPos = Integer.parseInt(br.readLine());
    int sum = 0;
    String[] data = br.readLine().split(" ");
    int[] pos = new int[numPos];
    for(int i=0; i<numPos; i++){
      pos[i] = Integer.parseInt(data[i]);
      sum += pos[i];
    }
    double average = (double)sum/(double)numPos;
    
    int meetingPos = (int)Math.round(average);
    int result = 0;
    
    for(int i=0; i<numPos; i++){
      result += Math.pow(pos[i]-meetingPos, 2);
    }
    System.out.println(result);
  }
}
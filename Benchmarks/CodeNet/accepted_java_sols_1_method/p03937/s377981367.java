import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] in1 = br.readLine().split(" ");
    int H = Integer.parseInt(in1[0]);
    int W = Integer.parseInt(in1[1]);

    String[] glid = new String[H]; 
    for(int i = 0; i < H; i++){
      glid[i] = br.readLine();
    }
    br.close();

    String someString = "ksksk111";
    int a = (int)someString.chars().filter(ch -> ch == 'k').count();

    
    int hashNum = 0;
    for(int i = 0; i < H; i++){
      hashNum += (int)glid[i].chars().filter(ch -> ch == '#').count();
    }

    hashNum--;
    int y = 0, x = 0;
    while(!(y == H-1 && x == W-1)){
      if(y != H-1 && glid[y+1].charAt(x) == '#'){
        y++;
        hashNum--;
      }else if(x != W-1 && glid[y].charAt(x+1) == '#'){
        x++;
        hashNum--;
      }else{
        break;
      }
    }
    
    if(y == H-1 && x == W-1 && hashNum == 0)
      System.out.println("Possible");
    else
      System.out.println("Impossible");
  }
}